package com.hangzhou.tool.reflect;

/**
 * @Author linchenghui
 * @Date 2021/5/19
 */
public class Apple implements Fruit{

    private String name;

    @Override
    public void eat() {
        System.out.println("Apple");
    }

    public Apple() {

    }

    public Apple(String name) {
        this.name = name;
    }
}
