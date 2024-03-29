package com.griftt.lifemix.core.aop;

import cn.stylefeng.roses.core.config.properties.MutiDataSourceProperties;
import cn.stylefeng.roses.core.mutidatasource.DataSourceContextHolder;
import com.griftt.biz.annotation.DataSource;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Slf4j
@Aspect
@Component
@ConditionalOnProperty(prefix = "guns.muti-datasource", name = "open",havingValue = "true")
public class DataSouceAop implements Ordered {

    @Autowired
    private MutiDataSourceProperties mutiDataSourceProperties;

    @Pointcut("@annotation(com.griftt.biz.annotation.DataSource)")
    public void cut(){


    }



    @Around("cut()")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        System.err.println("开始切面处理");
        Signature signature = point.getSignature();
        if(!(signature instanceof MethodSignature)){
                  throw new RuntimeException();
        }
        String dataSourceType =null;
                MethodSignature methodSignature = (MethodSignature) signature;
        //获取当前类
        Class<?> targetClass = point.getTarget().getClass();
        Method currentMethod = targetClass.getMethod(methodSignature.getName(), methodSignature.getParameterTypes());
        DataSource datasource = currentMethod.getAnnotation(DataSource.class);
        if (datasource != null) {
            DataSourceContextHolder.setDataSourceType(datasource.name());
            log.info("设置数据源为：" + datasource.name());
        } else {
             dataSourceType = DataSourceContextHolder.getDataSourceType();
            DataSourceContextHolder.setDataSourceType(mutiDataSourceProperties.getDataSourceNames()[0]);
            log.info("设置数据源为：dataSourceCurrent");
        }
        try {
            return point.proceed();
        } finally {
            log.info("清空数据源信息！");
            DataSourceContextHolder.clearDataSourceType();
            /*log.info("恢复为默认数据源信息!");
            DataSourceContextHolder.setDataSourceType(dataSourceType);*/
        }

    }


    /**
     * aop的顺序要早于spring的事务
     */
    @Override
    public int getOrder() {
        return -11;
    }
}
