package com.hangzhou.tool.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author linchenghui
 * @Date 2021/5/6
 */
@Component
public class Two {

//    @Autowired
    One one;

//    public void setOne(One one) {
//        this.one = one;
//    }

    public Two(One one){

    }
}
