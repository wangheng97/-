package com.wh.test;

/**
 * TestCachal
 *
 * @author wangheng
 * @date 2019/7/29
 */

import com.wh.pojo.Project;
import org.hibernate.Session;
import util.HibernateUtil;

/**
 * 二级缓存
 * 0,导入jar包
 * 1，配置文件中开启二级缓存
 *  <property name="cache.use_second_level_cache">true</property>
 * 2，配置支持二级缓存的支持类
 * <property name="hibernate.cache.region.factory_class">org.hibernate.cache.ehcache.internal.SingletonEhcacheRegionFactory</property>
 * 3，再所查询的需要缓存的映射文件中，<class>下面配置<cache usage="read-only"/>
 * 或者可以直接在配置文件中对类配置
 * 4，自定义缓存策略
 *      自定义ehcache.xml
 *      此文件模板在ehcache.jar包下ehcache-failsafe.xml
 * */
public class TestCachal {
    public static void main(String[] args) {
        test1();
        test1();
    }
    public static void test1(){
        Session session= HibernateUtil.getSession();
       Project project= session.get(Project.class,3);
        System.out.println(project.getPname()+">>>>"+project.getPno());
        session.close();
    }
}
