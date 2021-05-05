package com.hangzhou.tool.map;

import java.util.HashMap;
import java.util.Objects;

/**
 * @Author linchenghui
 * @Date 2021/5/3
 */
public class RedBlackTreeDemo {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        for (int i = 1; i <= 8; i++) {
            hashMap.put(new Node(i),"node");
        }
        hashMap.put(new Node(9),"node");
        hashMap.put(new Node(10),"node");
        // 如果存放节点的Hash相同时,到这一步 HashMap$Node 转换成 HashMap$TreeNode
        hashMap.put(new Node(11),"node");
        hashMap.put(new Node(12),"node");
        // 如果存放节点的Hash不相同时,到这一步扩容由于已达到 16 * 0。75 = 12 个所以扩容
        hashMap.put(new Node(13),"node");
        System.out.println(hashMap);
    }
}

class Node {
    private int num;

    public Node(int num) {
        this.num = num;
    }

    @Override
    public int hashCode() {
        return 100;
    }
}
