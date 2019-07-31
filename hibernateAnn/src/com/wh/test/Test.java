package com.wh.test;

import com.wh.pojo.Project;
import com.wh.pojo.School;
import com.wh.pojo.Student;
import com.wh.util.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

/**
 * Test
 *
 * @author wangheng
 * @date 2019/7/29
 */
public class Test {
    public static void main(String[] args) {
        //test();
        save();
    }
    public static void test(){
        Session session= HibernateUtil.getSession();
        String hql="from Project ";
        Query query= session.createQuery(hql);
        List<Project> list= query.list();
        for (Project project : list) {
            System.out.println(project.getPname()+">>"+project.getPno());
        }
        session.close();
    }
    public static void save(){
        Configuration cfg = new Configuration().configure();
        Session session= HibernateUtil.getSession();
        Transaction tran = session.beginTransaction();
        School school = new School();
        school.setScname("西中");
        school.setAddress("西路");

        Student student = new Student();
        student.setSname("小");

        student.setSchoolByScid(school);

        session.save(school);
        session.save(student);
        tran.commit();
        session.close();
    }
    public static void save2(){
        Session session=HibernateUtil.getSession();
        Transaction tran = session.beginTransaction();
        School school = new School();
        school.setScname("西安十八中");
        school.setAddress("西安西路");

        Student student = new Student();
        student.setSname("张小话");

        student.setSchoolByScid(school);
        session.save(student);
        tran.commit();
        session.close();
    }
}
