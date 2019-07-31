package com.wh.demo1;

import com.wh.framework.ApplicationContext;

/**
 * TestSpring
 *
 * @author wangheng
 * @date 2019/7/29
 */
public class TestSpring {

    public static void main(String[] args) {
        ApplicationContext applicationContext=new ApplicationContext("/com/wh/demo1/spring.xml");
        Computer computer=applicationContext.getBean("colorPaper");
        System.out.println(computer);
        computer.run();

    }
}
