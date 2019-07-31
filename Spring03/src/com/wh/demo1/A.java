package com.wh.demo1;

/**
 * A
 *
 * @author wangheng
 * @date 2019/7/30
 */
public class A {
    private  int id;
    public void Init(){
        System.out.println("+++初始化+++");
    }

    public  A(){
        System.out.println(id+"====A====");
    }
    public void Destory(){
        System.out.println("销毁");
    }

    public void setId(int id) {
        this.id = id;
    }
}
