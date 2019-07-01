package com.griftt.biz.servcie;

import com.griftt.biz.annotation.DataSource;
import com.griftt.biz.entity.Activity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class WorkService {

    @Autowired
    private ActivityService activityService;

    @Transactional(rollbackFor = Exception.class)
    @DataSource(name = "dataSource")
    public void primaryDataTran(){
        activityService.multiDataTran();
        Activity activity = activityService.getById(30);
        System.err.println("primary:"+activity.getType());
        activity.setType(activity.getType()+10);
        activityService.updateById(activity);
        System.out.println("修改从主数据库");

    }

}
