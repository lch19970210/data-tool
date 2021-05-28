package com.hangzhou.tool.reflect;

import java.lang.reflect.Constructor;

/**
 * @Author linchenghui
 * @Date 2021/5/19
 */
public class ReflectDemo {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("com.hangzhou.tool.reflect.Apple");
        Constructor<?>[] constructors = clazz.getConstructors();
        for (Constructor cons:constructors) {
            System.out.println(cons);
        }
    }
}
