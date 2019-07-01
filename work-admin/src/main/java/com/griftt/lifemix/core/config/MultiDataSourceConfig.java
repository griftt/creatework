package com.griftt.lifemix.core.config;

import cn.stylefeng.roses.core.config.properties.MutiDataSourceProperties;
import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import com.alibaba.druid.support.spring.stat.BeanTypeAutoProxyCreator;
import com.alibaba.druid.support.spring.stat.DruidStatInterceptor;
import com.griftt.lifemix.core.properties.DuridConfigProperties;
import com.griftt.lifemix.core.properties.SQLConnectParmter;
import com.griftt.lifemix.multidatasource.DynamicDataSource;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Around;
import org.springframework.aop.Advisor;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.JdkRegexpMethodPointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

@Configuration
@ConditionalOnProperty(prefix = "guns.muti-datasource", name = "open", havingValue = "true", matchIfMissing = true)
public class MultiDataSourceConfig {
    /**
     * 多数据源的配置步骤
     * 1.实现spring的AbstractRoutingDataSource   为 MultiDatasouce
     * 这个类是实现多数据源的关键，他的作用就是动态切换数据源，实质：有多少个数据源就存多少个数据源在
     * targetDataSources（是AbstractRoutingDataSource的一个map类型的属性，其中value为每个数据源，key表示每个数据源的名字）这个属性中，
     * 然后根据determineCurrentLookupKey（）这个方法获取当前数据源在map中的key值，然后determineTargetDataSource（）方法中动态获取当前数据源
     * ，如果当前数据源不存并且默认数据源也不存在就抛出异常。
     * ---------------------
     * 作者：一只仰望天空的菜鸟
     * 来源：CSDN
     * 原文：https://blog.csdn.net/tuesdayma/article/details/81081666
     * 版权声明：本文为博主原创文章，转载请附上博文链接！ b
     *
     * 2. 先加载所有的数据库配置
     *
     * 3.加载配置进数据源
     *
     * 4.设置默认的数据源
     *
     * 5，编写切面，拦截 @DataSource（“datasource"）
     */

    @Autowired
    private ApplicationContext applicationContext;

    //获取数据默认数据库配置
    @Bean
   public DruidDataSource primaryDataSource(@Qualifier("duridConfigProperties")  DuridConfigProperties duridConfigProperties){
       DruidDataSource druidDataSource = new DruidDataSource();
       //log.info("数据源信息加载");
       String profile = applicationContext.getEnvironment().getActiveProfiles()[0];
       org.springframework.core.env.Environment environment = applicationContext.getEnvironment();
       SQLConnectParmter env=null;
       if("dev"==profile){
           env = duridConfigProperties.getDev();
       }else {
           env=duridConfigProperties.getProd();
       }
       duridConfigProperties.config(druidDataSource);
       druidDataSource.setUrl(env.getUrl());
       druidDataSource.setPassword(env.getPassword());
       druidDataSource.setUsername(env.getUsername());
       return druidDataSource;
   }



    //获取多数据源配置
    @Bean
    @ConfigurationProperties(prefix = "guns.muti-datasource")
    public MutiDataSourceProperties mutiDataSourceProperties() {
        return new MutiDataSourceProperties();
    }


    @Bean
    public  DruidDataSource multiDataSource(@Qualifier("mutiDataSourceProperties")  MutiDataSourceProperties mutiDataSourceProperties){
        DruidDataSource druidDataSource = new DruidDataSource();
        mutiDataSourceProperties.config(druidDataSource);
        return druidDataSource;

    }

    /**
     * 开始多数据源配置
     * @param
     * @return
     */
    //注入多数据源的切换类
    @Bean
    public DynamicDataSource createMultiDataSource(@Qualifier("primaryDataSource") DruidDataSource dataSource,
                                                   @Qualifier("multiDataSource")  DruidDataSource multiDataSource  ){
        /*System.err.println(duridConfigProperties);
        System.err.println(mutiDataSourceProperties);
        //配置数据源
        DruidDataSource dataSource = primaryDataSource(duridConfigProperties);
        DruidDataSource multiDataSource = multiDataSource(mutiDataSourceProperties);*/
        DynamicDataSource dynamicDataSource = new DynamicDataSource();
        try {
            dataSource.init();
            multiDataSource.init();
        } catch (SQLException sql) {
            sql.printStackTrace();
        }
        //将数据源添加进map
        HashMap<Object, Object> map = new HashMap<>();
        map.put("dataSource",dataSource);
        map.put("multiDataSource",multiDataSource);
        dynamicDataSource.setTargetDataSources(map);
        //设置默认的数据源
        dynamicDataSource.setDefaultTargetDataSource(multiDataSource);
        return dynamicDataSource;

    }




    /**
     *
     * druidServlet注册
     */
    @Bean
    public ServletRegistrationBean druidServletRegistration() {
        ServletRegistrationBean registration = new ServletRegistrationBean(new StatViewServlet());
        registration.addUrlMappings("/druid/*");
        Map<String,String> initParams = new HashMap<>();
        //登录查看信息的账号密码.
        initParams.put("loginUsername","admin");
        initParams.put("loginPassword","123456");
        //白名单 值也可以是：127.0.0.1
        initParams.put("allow","");//默认就是允许所有访问
        //IP黑名单 (存在共同时，deny优先于allow) : 如果满足deny的话提示:Sorry, you are not permitted to view this page.
        initParams.put("deny","192.168.15.21");
        //是否能够重置数据.
        initParams.put("resetEnable","false");
        registration.setInitParameters(initParams);
        return registration;
    }

    /**
     * filter
     * druid监控 配置URI拦截策略
     */
    @Bean
    public FilterRegistrationBean druidStatFilter() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new WebStatFilter());
        //添加过滤规则.
        filterRegistrationBean.addUrlPatterns("/*");
        //添加不需要忽略的格式信息.
        filterRegistrationBean.addInitParameter(
                "exclusions", "/static/*,*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid,/druid/*");
        //用于session监控页面的用户名显示 需要登录后主动将username注入到session里
        filterRegistrationBean.addInitParameter("principalSessionName", "username");
        return filterRegistrationBean;
    }

    /**
     * druid数据库连接池监控
     */
    @Bean
    public DruidStatInterceptor druidStatInterceptor() {
        return new DruidStatInterceptor();
    }


    @Bean
    public JdkRegexpMethodPointcut druidStatPointcut() {
        JdkRegexpMethodPointcut druidStatPointcut = new JdkRegexpMethodPointcut();
        String patterns = "com.yunpuvip.sachet.modular.*.service.*";
        //可以set多个
        druidStatPointcut.setPatterns(patterns);
        return druidStatPointcut;
    }

    /**
     * druid数据库连接池监控
     */
    @Bean
    public BeanTypeAutoProxyCreator beanTypeAutoProxyCreator() {
        BeanTypeAutoProxyCreator beanTypeAutoProxyCreator = new BeanTypeAutoProxyCreator();
        beanTypeAutoProxyCreator.setTargetBeanType(DruidDataSource.class);
        beanTypeAutoProxyCreator.setInterceptorNames("druidStatInterceptor");
        return beanTypeAutoProxyCreator;
    }
    /**
     * druid 为druidStatPointcut添加拦截
     *
     * @return
     */
    @Bean
    public Advisor druidStatAdvisor() {
        return new DefaultPointcutAdvisor(druidStatPointcut(), druidStatInterceptor());
    }



}
