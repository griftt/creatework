package com.griftt.lifemix.admin.model;

import com.griftt.lifemix.core.annotation.HandlerStrategy;

@HandlerStrategy("one")
public class WorkTypeOne {

    public WorkTypeOne() {
        System.err.println("one");
    }
}
