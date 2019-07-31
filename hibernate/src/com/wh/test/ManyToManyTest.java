package com.wh.test;

import com.wh.pojo.Employee;
import com.wh.pojo.Project;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;


/**
 * ManyToManyTest
 *
 * @author wangheng
 * @date 2019/7/27
 */
public class ManyToManyTest {
    public static void main(String[] args) {
        save();
    }
    public static void save(){
        Employee emp = new Employee();
        Project pro = new Project();

        emp.setEname("孙悟空");

        pro.setPname("长安银行网银项目");

        //把新员工加入项目组
       pro.getEmployees().add(emp);

        //通过项目关联级联保存员工
        Session session = HibernateUtil.getSession();
        Transaction tran = session.beginTransaction();

        session.save(pro);

        tran.commit();
        session.close();


    }

}
