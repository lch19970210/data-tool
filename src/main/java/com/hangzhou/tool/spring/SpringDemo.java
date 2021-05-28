package com.hangzhou.tool.spring;

import com.hangzhou.tool.spring.bean.BeanConfig;
import com.hangzhou.tool.spring.bean.One;
import com.hangzhou.tool.spring.bean.Things;
import com.hangzhou.tool.spring.bean.Two;
import com.hangzhou.tool.spring.util.MyBeanFactoryPostProcessor;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * @Author linchenghui
 * @Date 2021/5/3
 */
public class SpringDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfig.class);
        One bean = (One) applicationContext.getBean("one");
        System.out.println(bean);
    }
}
