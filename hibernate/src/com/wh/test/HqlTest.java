package com.wh.test;

import com.wh.pojo.Project;
import com.wh.pojo.SchoolEntity;
import com.wh.pojo.StudentEntity;
import org.hibernate.Query;
import org.hibernate.Session;
import util.HibernateUtil;

import java.util.List;

/**
 * HqlTest
 *
 * @author wangheng
 * @date 2019/7/28
 */
public class HqlTest {
    public static void main(String[] args) {

    }

    //单个属性查询，元素类型为属性类型
    public static void select() {
        Session session = HibernateUtil.getSession();
        String hql = "select pname,pno from Project order by pno desc";
        Query query = session.createQuery(hql);
        List<Object[]> list = query.list();
        for (Object[] sch : list) {
            System.out.println(sch[0] + ">>>>>>>" + sch[1]);
            System.out.println("____________________");
        }
    }

    public static void select1() {
        Session session = HibernateUtil.getSession();
        String hql = "from Project where pno=:pno and pname=:pname";
        Query query = session.createQuery(hql);
        query.setParameter("pno", 0);
        query.setParameter("pname", 1);
        query.uniqueResult();
    }
    //分页
    public static void test1(){
        Session session=HibernateUtil.getSession();
        String hql="from Project";
        Query query= session.createQuery(hql);
        int pageno=2;//当前页数
        int rowspage=3;//每页显示最大记录数
        int start=(pageno-1)*rowspage;//当前页开始位置
        //设置每页显示记录数
        query.setMaxResults(rowspage);
        query.setFirstResult(start);
        List<Project> list= query.list();
        for (Project project : list) {
            System.out.println(project.getPno()+">>>"+project.getPname());
        }

    }
    public static void test2(){
        Session session=HibernateUtil.getSession();
        String hql="from SchoolEntity";
        Query query= session.createQuery(hql);
        List<SchoolEntity> list= query.list();
        for (SchoolEntity schoolEntity : list) {
            System.out.println(schoolEntity.getScname());
        }
    }
    public static void test3(){
        Session session=HibernateUtil.getSession();
        String hql="select sc.scname,count(stu.school.scid) from SchoolEntity sc left join StudentEntity stu on sc.scid =stu.school.scid group by sc.scid,sc.scname";
        Query query= session.createQuery(hql);
        List<Object[]> list=query.list();
        for (Object[] objects : list) {
            System.out.println(objects[0]+">>>>>>>>>>>"+objects[1]);
        }
        session.close();
    }
    public static void test4(){
        Session session=HibernateUtil.getSession();
        Query query = session.getNamedQuery("hql");
        List<StudentEntity> list =query.list();
        for (StudentEntity studentEntity : list) {
            System.out.println(studentEntity.getSname());
        }
    }
}
