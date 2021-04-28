package com.hangzhou.tool.collection.set;

import java.util.HashSet;
import java.util.Objects;

/**
 * @Author linchenghui
 * @Date 2021/4/22
 */
public class HashSetIncrement {
    public static void main(String[] args) {
        HashSet<Person> hashSet = new HashSet<>();
        for (int i = 1; i <= 12; i++) {
            hashSet.add(new Person(i));
        }
        System.out.println("HashSet: " + hashSet);
    }
}

class Person{
    private int num;

    Person(int num){
        this.num = num;
    }

    @Override
    public int hashCode() {
        return 100;
    }
}

