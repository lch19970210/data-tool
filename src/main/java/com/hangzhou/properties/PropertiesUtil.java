package com.hangzhou.properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.EncodedResource;
import org.springframework.core.io.support.PropertiesLoaderUtils;

import java.io.IOException;
import java.util.Properties;

public class PropertiesUtil {
    private static final Logger logger = LoggerFactory.getLogger(PropertiesUtil.class);

    private PropertiesUtil(){

    }

    public static Properties getProperties(String location){
        Properties properties = null;
        try{
            logger.info("资源加载[{}]",location);
            properties = PropertiesLoaderUtils
                    .loadProperties(new EncodedResource(new ClassPathResource(location),"UTF-8"));
        }catch (IOException e){
            logger.info("资源加载失败[{}]",location);
            logger.info(e.getMessage());
            e.printStackTrace();
        }
        return properties;
    }

    public static void main(String[] args) {
        PropertiesUtil propertiesUtil = new PropertiesUtil();
        Properties properties = propertiesUtil.getProperties("application.properties");
        System.out.println(properties.get("port"));
    }
}
