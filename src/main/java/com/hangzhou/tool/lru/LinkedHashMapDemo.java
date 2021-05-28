package com.hangzhou.tool.lru;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @Author linchenghui
 * @Date 2021/5/23
 */
public class LinkedHashMapDemo extends LinkedHashMap {
    /**
     * 缓存大小
     */
    private int capacity;

    /**
     * 构造器
     * @param capacity 缓存大小
     */
    public LinkedHashMapDemo(int capacity) {
        // 第三个参数 true 时代表访问顺序,false 时代表插入顺序
        super(capacity, 0.75F, false);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry eldest) {
        // 判断当前容量是否大于设置的大小
        return super.size() > capacity;
    }

    /**
     * true:
     * [1, 2, 3]
     * [2, 3, 4]
     * [2, 4, 3]
     * [4, 3, 5]
     *
     * false:
     * [1, 2, 3]
     * [2, 3, 4]
     * [2, 3, 4]
     * [3, 4, 5]
     */
    public static void main(String[] args) {
        LinkedHashMapDemo demo = new LinkedHashMapDemo(3);
        demo.put(1, "a");
        demo.put(2, "b");
        demo.put(3, "c");
        System.out.println(demo.keySet());
        demo.put(4, "d");
        System.out.println(demo.keySet());
        demo.put(3, "c");
        System.out.println(demo.keySet());
        demo.put(5, "e");
        System.out.println(demo.keySet());
    }
}
