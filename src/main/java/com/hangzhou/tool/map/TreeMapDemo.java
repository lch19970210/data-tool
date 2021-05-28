package com.hangzhou.tool.map;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * @Author linchenghui
 * @Date 2021/5/16
 */
public class TreeMapDemo {
    public static void main(String[] args) {
        // 无参构造器
        TreeMap treaMap = new TreeMap();
        treaMap.put("bc","bc");
        treaMap.put("abc","abc");
        treaMap.put("c","c");
        // 默认按照字典表排序
        // {abc=abc, bc=bc, c=c}
        System.out.println(treaMap);
        TreeMap map = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        });
        String str = "";
    }
}
