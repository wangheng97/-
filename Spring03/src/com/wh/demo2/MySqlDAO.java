package com.wh.demo2;

/**
 * MySqlDAO
 *
 * @author wangheng
 * @date 2019/7/30
 */
public class MySqlDAO implements Dao{
    @Override
    public void connectionDB(){
        System.out.println("连接到MySql数据库");
    }
}
