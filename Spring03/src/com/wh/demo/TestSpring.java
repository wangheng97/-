package com.wh.demo;

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
    ApplicationContext appl=new ClassPathXmlApplicationContext("/com/wh/demo/spring.xml");
  IterIsk iterIsk= (IterIsk) appl.getBean("iterIsk");

        iterIsk.run();
}
}