package com.griftt.lifemix.core.aop;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class HelloAop {

    @Pointcut("@annotation(com.griftt.biz.annotation.Hello)")
    public void cut(){

    }

    @Around("cut()")
    public void handle(){
        System.err.println("hello heoolo aop1 ");
        System.err.println("hello heoolo aop 2");
    }
}
