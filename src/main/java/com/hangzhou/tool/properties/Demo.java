package com.hangzhou.tool.properties;

import java.io.IOException;
import java.io.InputStream;

public class Demo {
    public static void main(String[] args) throws IOException {
        String projectRootPath = Demo.getPropertiesPath("application.properties");
        System.out.println(projectRootPath);
        getProperties("application.properties");
    }

    /**
     * 返回对应文件的路径(在本地读取或打成war包的时候,磁盘或者Linux上是有真实路径存在的.但是打包成jar包是没有真实路径存在的,文件路径只是位于jar包内部的一个路径)
     * @param fileName 文件名称
     * @return 路径
     */
    public static String getPropertiesPath(String fileName){
        String path = null;
        try{
            path = Thread.currentThread().getContextClassLoader().getResource(fileName).getPath();
        }catch (Exception e){
            e.printStackTrace();
        }
        return path;
    }

    /**
     * 为解决打包成jar包后没有真实路径存在的问题使用流直接读取文件
     * @param fileName
     * @return
     */
    public static String getProperties(String fileName) throws IOException {
        InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream(fileName);
        byte[] bytes = new byte[1024];
        int len = 0,temp = 0;
        while((temp = is.read()) != -1){
            bytes[len] = (byte) temp;
            len++;
        }
        is.close();
        System.out.println(new String(bytes,0,len));
        return new String(bytes,0,len);
    }
}
