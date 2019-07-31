package com.wh.demo3;

import com.wh.demo2.Dao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;

/**
 * TestSpring
 *
 * @author wangheng
 * @date 2019/7/30
 */
public class TestSpring {
    public static void main(String[] args) {
        ApplicationContext appl = new ClassPathXmlApplicationContext("com/wh/demo3/spring.xml");
        Student student = (Student) appl.getBean("student1");
        System.out.println(student.getName() + ">>" + student.getSchool());

    }
}
