package com.griftt.biz.servcie;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.griftt.biz.annotation.DataSource;
import com.griftt.biz.entity.Activity;
import com.griftt.biz.mapper.ActivityMapper;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import java.util.List;

@Service
public class ActivityService extends ServiceImpl<ActivityMapper, Activity> {

    @DataSource(name = "dataSource")
    public List<Activity> getActictyList(){
        return getBaseMapper().selectList(null);
    }


    public List<Activity> getActictyListMapper(){
        return getBaseMapper().getActivity();
    }

    @Transactional(isolation = Isolation.READ_COMMITTED,rollbackFor = Exception.class)
    @Async
    public void updateOne(){
        Activity activity = baseMapper.selectById(30);
        System.err.println(activity.getType());
        for(int i=0;i<8;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Activity activity2 = baseMapper.selectById(30);
        System.err.println(activity2.getType());
        activity.setType(activity.getType()-3);
    }
    @Transactional(rollbackFor = Exception.class)

    public void updateTwo(){
        Activity activity = baseMapper.selectById(30);
        System.err.println("two:"+activity.getType());
        activity.setType(activity.getType()+2);
        baseMapper.updateById(activity);

    }




}
