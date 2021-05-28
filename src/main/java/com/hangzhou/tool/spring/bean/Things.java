package com.hangzhou.tool.spring.bean;

import org.springframework.stereotype.Component;

/**
 * @Author linchenghui
 * @Date 2021/5/6
 */
@Component
public class Things {

    public One one;
    public Two two;

    public void setOne(One one) {
        this.one = one;
    }

    public void setTwo(Two two) {
        this.two = two;
    }

    public void print(){
        System.out.println(one + " - " + two);
    }

}
