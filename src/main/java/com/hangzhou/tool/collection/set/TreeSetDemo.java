package com.hangzhou.tool.collection.set;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @Author linchenghui
 * @Date 2021/5/15
 */
public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet(new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String) o1).length() - ((String) o2).length();
            }
        });

        treeSet.add("a");
        treeSet.add("ab");
        treeSet.add("abc");
        System.out.println(treeSet);
    }
}
