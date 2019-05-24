package com.griftt.lifemix.controller;

import com.griftt.biz.entity.Activity;
import com.griftt.biz.servcie.ActivityService;
import com.griftt.lifemix.admin.model.WorkTypeOne;
import com.griftt.lifemix.core.properties.DuridConfigProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/test")
@EnableConfigurationProperties
public class testController {

    @Autowired
    private DuridConfigProperties druid;

    @Autowired
    private ActivityService activityService;
    @Autowired
    private WorkTypeOne workTypeOne;


    @RequestMapping("/hello")
    @ResponseBody
    public String hello(HttpServletRequest request){
        return "hello"+request.getContextPath()+"，"+request.getPathInfo()+workTypeOne;
    }

    @RequestMapping("/hello2")
    @ResponseBody
    public Object hell2(){
        List<Activity> actictyList = activityService.getActictyList();
        List<Activity> actictyListMapper = activityService.getActictyListMapper();
       System.err.println(actictyList);
        System.err.println(actictyListMapper);
        return actictyListMapper;
    }

    public testController() {
        System.err.println("controller 实例化");
    }
}
