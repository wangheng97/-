package com.wh.demo1;

import com.wh.demo2.Dao;
import com.wh.demo2.DaoFactory;
import com.wh.demo2.MySqlDAO;

/**
 * TestDB
 *
 * @author wangheng
 * @date 2019/7/30
 */
public class TestDB {
    public static void main(String[] args) {
        DaoFactory daoFactory=new DaoFactory();
       Dao dao=daoFactory.newDao(DaoFactory.DB_ORCAL);
        dao.connectionDB();
    }
}
