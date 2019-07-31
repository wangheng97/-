package com.wh.demo2;

/**
 * DaoFactory
 *
 * @author wangheng
 * @date 2019/7/30
 */
public class DaoFactoryStatic {
    public static final int DB_MYSQL = 1;
    public static final int DB_ORCAL = 2;
    public static final int DB_SQLSERVL = 3;

    public static Dao newDao(int ty) {
        if (ty==DB_MYSQL){
            return new MySqlDAO();
        }else if (ty==DB_ORCAL){
            return new OrcalDAO();
        }else {
            return new Dao() {
                @Override
                public void connectionDB() {
                    System.out.println("默认数据库");
                }
            };
        }
    }

}