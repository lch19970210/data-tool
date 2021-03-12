package com.hangzhou.blockchain;

import java.security.MessageDigest;

/**
 * 简单的 Hash 算法
 */
public class SimpleHashAlgorithm {
    public static String applySha256(String input) {
        StringBuffer hexString = new StringBuffer();
        try {
            // 获取 SHA-256 散列算法的对象
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            // 对于input输出进行 hash 算法加密
            byte[] hash = digest.digest(input.getBytes("UTF-8"));
            for (int i = 0; i < hash.length; i++) {
                // 0xff:1111 1111  &:按位与操作
                String hex = Integer.toHexString(0xff & hash[i]);
                if (hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return hexString.toString();
    }
}
