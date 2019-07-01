package com.griftt.lifemix.core.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import com.alibaba.druid.support.spring.stat.BeanTypeAutoProxyCreator;
import com.alibaba.druid.support.spring.stat.DruidStatInterceptor;
import com.griftt.lifemix.core.properties.DruidCommonProperties;
import com.griftt.lifemix.core.properties.DuridConfigProperties;
import com.griftt.lifemix.core.properties.SQLConnectParmter;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.omg.CORBA.Environment;
import org.springframework.aop.Advisor;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.JdkRegexpMethodPointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

@Configuration
@Slf4j
@ConditionalOnProperty(prefix = "guns.muti-datasource", name = "open", havingValue = "false", matchIfMissing = true)
@EnableTransactionManagement
public class DataSourceConfig {

    @Autowired
    private ApplicationContext context;
    //使用该实例读取项目资源路径下application.properties文件中的内容
    @Autowired
    DuridConfigProperties duridConfigProperties;


    @Bean  		//产生bean实例加载进srping容器中,与spring配置文件中配置bean一样
    @Primary  	//当有多个实现时以此为优先为准
    public DruidDataSource primaryDataSource() throws Exception{
        log.info("数据源信息加载");
        String profile = context.getEnvironment().getActiveProfiles()[0];
        org.springframework.core.env.Environment environment = context.getEnvironment();
        SQLConnectParmter env=null;
        if("dev"==profile){
             env = duridConfigProperties.getDev();
        }else {
            env=duridConfigProperties.getProd();
        }
        DruidDataSource datasource = new DruidDataSource();
        datasource.setUrl(env.getUrl());
        datasource.setUsername(env.getUsername());
        datasource.setPassword(env.getPassword());
        DruidCommonProperties druidCommonProperties = duridConfigProperties.getDruidCommonProperties();
        log.info("druid配置信息：{}",druidCommonProperties);
        //configuration
        datasource.setInitialSize(druidCommonProperties.getInitialSize());
        datasource.setMinIdle(druidCommonProperties.getMinIdle());
        datasource.setMaxActive(druidCommonProperties.getMaxActive());
        datasource.setMaxWait(druidCommonProperties.getMaxWait());
        datasource.setTimeBetweenEvictionRunsMillis(druidCommonProperties.getTimeBetweenEvictionRunsMillis());
        datasource.setMinEvictableIdleTimeMillis(druidCommonProperties.getMinEvictableIdleTimeMillis());
        //datasource.setValidationQuery(validationQuery);
        //datasource.setTestWhileIdle(druidCommonProperties.get) ;
        datasource.setTestOnBorrow(druidCommonProperties.isTestOnBorrow());
        datasource.setTestOnReturn(druidCommonProperties.isTestOnReturn());
        //datasource.setPoolPreparedStatements(druidCommonProperties.is);
        //datasource.setMaxPoolPreparedStatementPerConnectionSize(druidCommonProperties.getmax);
        try {
            datasource.setFilters(environment.getProperty("spring.datasource.filters"));
        } catch (SQLException e) {
            log.error("druid configuration initialization filter", e);
        }
       // datasource.setConnectionProperties(connectionProperties);
        return datasource;
    }

    /**产生bean实例加载进srping容器中,与spring配置文件中配置bean一样
     *
     */
     //@Bean
    public SqlSessionFactory sqlSessionFactory( DataSource ds) throws Exception{
        log.info("SqlSessionFactoryBean 信息加载 ");
        log.info("ds 信息加载 :{}",ds);
        SqlSessionFactoryBean sqlSFB = new SqlSessionFactoryBean();
        sqlSFB.setDataSource(ds);
        return sqlSFB.getObject();

        //指定自定义的数据源,这个必须用,否则报错
        //sqlSFB.setTypeAliasesPackage(env.getProperty("mybatis.typeAliasesPackage"));
        //指定对应的实体包,多个包之间逗号隔开
        /* Resource configLocationResource = new PathMatchingResourcePatternResolver().getResource(
                env.getProperty("mybatis.configLocations"));
        sqlSFB.setConfigLocation(configLocationResource);*/
        //指定mybatis的本地配置文件资源,目的是定义实体等别名,可以不用,如果不用对应配置文件应注释掉
       /* Resource[] mapperLocations = new PathMatchingResourcePatternResolver().getResources(
                env.getProperty("mybatis.mapperLocations"));
        sqlSFB.setMapperLocations(mapperLocations);*/
        //指定mybatis的库表到实体的映射xml文件的mapper资源
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

    public DataSourceConfig (){
        System.err.println("单数据源 启动");
    }

}
