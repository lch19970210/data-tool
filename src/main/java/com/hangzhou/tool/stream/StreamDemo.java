package com.hangzhou.tool.stream;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

/**
 * @Author linchenghui
 * @Date 2021/4/23
 */
public class StreamDemo {
    public static void main(String[] args) {
        ArrayList<Node> arrayList = new ArrayList<Node>();
        arrayList.add(new Node("1"));

        Map<String, Node> map = new HashMap<String, Node>();
        arrayList.forEach(item -> {
            map.put(item.getId(),item);
        });

        System.out.println(map);
        System.out.println(null != map.get("1"));
    }
}

@Data
@AllArgsConstructor
class Node {
    private String id;
}
