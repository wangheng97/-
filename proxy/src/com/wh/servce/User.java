package com.wh.servce;

/**
 * User
 *
 * @author wangheng
 * @date 2019/7/31
 */
public class User implements IUserLogin {
    @Override
    public void login(String name,String password) {
        System.out.println("登陆成功");
    }
}
