package com.griftt.lifemix.controller;

import com.griftt.lifemix.core.properties.DuridConfigProperties;
import com.griftt.lifemix.core.properties.Tw;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
@EnableConfigurationProperties
public class testController {

    @Autowired
    private DuridConfigProperties druid;
     @Autowired
    private Tw tt;

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){

        return "hello"+druid;
    }

    @RequestMapping("/hello2")
    @ResponseBody
    public String hell2(){

        return "hello"+tt;
    }

}
