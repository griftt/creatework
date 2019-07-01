package com.griftt.lifemix.controller;

import com.griftt.biz.annotation.DataSource;
import com.griftt.biz.entity.Activity;
import com.griftt.biz.servcie.ActivityService;
import com.griftt.biz.servcie.WorkService;
import com.griftt.lifemix.admin.model.WorkTypeOne;
import com.griftt.biz.annotation.Hello;
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

    @Autowired
    private WorkService workService;


    @RequestMapping("/hello")
    @ResponseBody
    public  List<Activity> hello(HttpServletRequest request){
        List<Activity> actictyList = activityService.getActictyList();
        System.err.println(actictyList);
       // List<Activity> actictyList2 = activityService.getActictyListMapper();
       // System.err.println(actictyList2);
        return actictyList;
    }


    @RequestMapping("/hello2")
    @ResponseBody
    public Object hell2(){
        List<Activity> actictyList = activityService.getActictyListMapper();
        System.err.println(actictyList);
        return actictyList;
    }


    @RequestMapping("/aop")
    @ResponseBody
    public Object aop(){
        List<Activity> actictyList = activityService.getActictyListMapper();
        System.err.println(actictyList);
        return actictyList;
    }


    @RequestMapping("/multi")
    @ResponseBody
    public Object tra(){
        workService.primaryDataTran();
        return "ok";
    }


   /* @RequestMapping("/pri")
    @ResponseBody
    public Object tra2(){
        activityService.primaryDataTran();
        return "ok";
    }*/

    public testController() {
        System.err.println("controller 实例化");
    }
}
