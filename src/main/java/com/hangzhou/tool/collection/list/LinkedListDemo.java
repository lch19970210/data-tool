package com.hangzhou.tool.collection.list;

import java.util.LinkedList;

/**
 * @Author linchenghui
 * @Date 2021/4/8
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add("1");
        linkedList.add("2");
        linkedList.add("3");
        System.out.println(linkedList);
        Object remove = linkedList.remove();
        System.out.println(remove);
        System.out.println(linkedList);

    }
}

/**
 * 双向链表的一个节点
 */
class Node{
    public Object item;
    public Node next;
    public Node prev;

    public Node(Object name){
        this.item = name;
    }

    public String toString(){
        return "Node name = " + item;
    }
}
