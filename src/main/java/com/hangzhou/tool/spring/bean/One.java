package com.hangzhou.tool.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author linchenghui
 * @Date 2021/5/6
 */
@Component
public class One {

//    @Autowired
    Two two;

//    public void setTwo(Two two) {
//        this.two = two;
//    }

    public One(Two two){

    }
}

