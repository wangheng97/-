package com.wh.demo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * TestSpring2
 *
 * @author wangheng
 * @date 2019/7/30
 */
public class TestSpring2 {
    public static void main(String[] args) {
        ApplicationContext appl=new ClassPathXmlApplicationContext("/com/wh/demo1/spring2.xml");
       List list= (List) appl.getBean("list");
        System.out.println(list.toString());
    }

}
