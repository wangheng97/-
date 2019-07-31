package com.wh.test;

/**
 * TestCachal
 *
 * @author wangheng
 * @date 2019/7/29
 */

import com.wh.pojo.Project;
import org.hibernate.Query;
import org.hibernate.Session;
import util.HibernateUtil;

import java.util.List;

/**
 * Queru缓存
 * 1,开启二级缓存
 * 2，在配置文件中开启query缓存
 * 3,使用query.list()前，query.setCacheable(true);
 * */
public class TestCachal1 {
    public static void main(String[] args) {
        test1();
        test1();
    }
    public static void test1(){
        Session session= HibernateUtil.getSession();
       String hql="from Project ";
        Query query= session.createQuery(hql);
        query.setCacheable(true);
        List<Project> list= query.list();
        for (Project project : list) {
            System.out.println(project.getPname()+">>"+project.getPno());
        }
       session.close();
    }
}
