package com.hangzhou;

import com.hangzhou.tool.reflect.Factory;

import java.util.Arrays;
import java.util.List;

/**
 * @Author linchenghui
 * @Date 2021/3/31
 */
public class test {
    public static void main(String[] args) {
        Son son = new Son();
        son.father();

    }
}

class Father {
    public void father() {
        System.out.println("father");
    }
}

class Son extends Father {
    public void son() {
        System.out.println("son");
    }
}
