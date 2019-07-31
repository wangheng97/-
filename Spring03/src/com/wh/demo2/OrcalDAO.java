package com.wh.demo2;

/**
 * MySqlDAO
 *
 * @author wangheng
 * @date 2019/7/30
 */
public class OrcalDAO implements Dao{
    @Override
    public void connectionDB(){
        System.out.println("连接到Orcal数据库");
    }
}
