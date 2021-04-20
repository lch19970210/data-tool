package com.hangzhou.tool.collection.set;

import java.util.HashSet;

/**
 * 阅读 HashSet 源码
 * @Author linchenghui
 * @Date 2021/4/9
 */
public class HashSetDemo {
    public static void main(String[] args) {
//        Set set = new HashSet();
//        set.add(null);
//
//        Node[] nodeTable = new Node[16];

        HashSet hashSet = new HashSet();
        hashSet.add("java");
        hashSet.add(null);
        hashSet.add("java");
        System.out.println("hashSet:" + hashSet);
    }
}

/**
 * 节点
 */
class Node{
    /**
     * 存放数据
     */
    private String item;
    /**
     * 指向下一个节点从而实现链表
     */
    private Node next;
}
