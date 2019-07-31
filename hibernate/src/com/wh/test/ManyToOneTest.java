package com.wh.test;

import com.wh.pojo.SchoolEntity;
import com.wh.pojo.StudentEntity;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import util.HibernateUtil;
/**
 * ManyToOneTest
 * @author wh
 * @date 2019/07/27
 * */
public class ManyToOneTest {
    public static void main(String[] args) {
        //get();
       //save();
        save2();
    }
    /**
     * many-to-one
     * lazy
     * 延时加载：延时到使用时才加载查询
     * get()和load区别
     * 1.
     * get:默认不延时加载，默认只会对关联对象延时加载 lazy=true
     * load:默认延时加载，先返回代理对象，在使用到对象中属性时，才去查询
     * 2.
     * get：如果查询一个不存在记录时，返回null
     * load:如果指定的主键不存在，则抛出异常
     */
    public static void get(){
        Session session=HibernateUtil.getSession();
        StudentEntity student = session.get(StudentEntity.class,4 );
        System.out.println("====="+student);
        System.out.println("*******************");
        System.out.println(student.getSname());
        System.out.println("**********2******");
        System.out.println(student.getSchool().getScname());

        session.close();
    }

    public static void save(){
        Configuration cfg = new Configuration().configure();
        Session session= HibernateUtil.getSession();
        Transaction tran = session.beginTransaction();
        SchoolEntity school = new SchoolEntity();
        school.setScname("西安五中");
        school.setAddress("西安友谊西路");

        StudentEntity student = new StudentEntity();
        student.setSname("小张");

        student.setSchool(school);

        session.save(school);
        session.save(student);
        tran.commit();
        session.close();
    }

    /**
     * cascade="all" 级联保存
     */
    public static void save2(){
        Session session=HibernateUtil.getSession();
        Transaction tran = session.beginTransaction();
        SchoolEntity school = new SchoolEntity();
        school.setScname("西安六中");
        school.setAddress("西安友谊西路");

        StudentEntity student = new StudentEntity();
        student.setSname("张小");

        student.setSchool(school);
        session.save(student);
        tran.commit();
        session.close();
    }
}
