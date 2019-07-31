package com.wh.demo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * TestSpring
 *
 * @author wangheng
 * @date 2019/7/30
 */
public class TestSpring {
    public static void main(String[] args) {
        ApplicationContext appl=new ClassPathXmlApplicationContext("/com/wh/demo1/spring1.xml");

    }
}
