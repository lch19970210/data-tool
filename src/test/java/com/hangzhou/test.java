package com.hangzhou;

import java.util.Arrays;
import java.util.List;

/**
 * @Author linchenghui
 * @Date 2021/3/31
 */
public class test {
    public static void main(String[] args) {
        String[] str = {
            "a",
            "b",
            "c"
        };
        List<String> strs = Arrays.asList(str);
        System.out.println(strs.remove("b"));

    }
}
