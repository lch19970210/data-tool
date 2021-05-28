package com.hangzhou.tool.collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @Author linchenghui
 * @Date 2021/4/6
 */
public class CollectionIterator {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("aaa");
        set.add("bbb");
        set.add("ccc");
        set.add("ddd");
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }
        // 迭代器遍历后需要重置
        Object next = iterator.next();
        System.out.println(next);

        Collections.sort(null);
    }
}
