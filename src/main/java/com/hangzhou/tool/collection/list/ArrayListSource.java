package com.hangzhou.tool.collection.list;

import java.util.ArrayList;

/**
 * @Author linchenghui
 * @Date 2021/4/7
 */
public class ArrayListSource {
    public static void main(String[] args) {
//        ArrayList arrayList = new ArrayList();
        ArrayList arrayList = new ArrayList(8);
        for (int i = 1; i <= 10; i++) {
            arrayList.add(i);
        }
        for (int i = 11; i <= 15; i++) {
            arrayList.add(i);
        }
        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(null);
        arrayList.stream().forEach(item -> System.out.println(item));

    }
}
