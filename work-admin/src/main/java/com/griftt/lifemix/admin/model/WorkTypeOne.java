package com.griftt.lifemix.admin.model;

import com.griftt.biz.annotation.HandlerStrategy;

@HandlerStrategy("one")
public class WorkTypeOne {

    public WorkTypeOne() {
        System.err.println("one");
    }
}
