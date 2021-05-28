package com.hangzhou.tool.reflect;

/**
 * @Author linchenghui
 * @Date 2021/5/19
 */
public class Factory {
    public static Fruit getInstance(String className) {
        Fruit fruit = null;
        try {
            fruit = (Fruit) Class.forName(className).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return fruit;
    }

    public static void main(String[] args) {
        Fruit apple = Factory.getInstance("com.hangzhou.tool.reflect.Apple");
        if (apple != null) {
            apple.eat();
        }
    }
}
