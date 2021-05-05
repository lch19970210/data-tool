package com.hangzhou.tool.map;

import java.util.Hashtable;

/**
 * @Author linchenghui
 * @Date 2021/5/3
 */
public class HashTableDemo {
    public static void main(String[] args) {
        /**
         * // 空参构造器,指定容量大小
         * public Hashtable() {
         *   this(11, 0.75f);
         * }
         *
         * int newCapacity = (oldCapacity << 1) + 1;
         */
        Hashtable hashtable = new Hashtable();
        hashtable.put("1","1");
        // java.lang.NullPointerException
        hashtable.put(null, 2);
    }
}
