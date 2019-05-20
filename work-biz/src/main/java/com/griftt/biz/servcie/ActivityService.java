package com.griftt.biz.servcie;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.griftt.biz.entity.Activity;
import com.griftt.biz.mapper.ActivityMapper;
import org.springframework.stereotype.Service;

import java.util.List;

import java.util.List;

@Service
public class ActivityService extends ServiceImpl<ActivityMapper, Activity> {


    public List<Activity> getActictyList(){
        return getBaseMapper().selectList(null);
    }
    public List<Activity> getActictyListMapper(){
        return getBaseMapper().getActivity();
    }
}
