package com.griftt.biz.servcie;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.griftt.biz.mapper.TestMapper;
import com.griftt.biz.model.TestModel;
import org.springframework.stereotype.Service;

@Service
public class TestSerivice extends ServiceImpl<TestMapper, TestModel> {


    public String re(){
        return "hello";
    }


}
