package com.hangzhou.tool.collection.set;


import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @Author linchenghui
 * @Date 2021/4/24
 */
public class LinkedHashSetDemo {
    public static void main(String[] args) {
        Set set = new LinkedHashSet();
        set.add(new String("pig"));
        set.add(1);
        set.add(1);
        set.add(2);
    }
}
