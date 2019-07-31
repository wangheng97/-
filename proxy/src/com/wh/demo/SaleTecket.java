package com.wh.demo;

/**
 * SaleTecket
 *
 * @author wangheng
 * @date 2019/7/31
 * 业务类
 */
public class SaleTecket implements ISaleTecket{
    @Override
    public void sale(){
        System.out.println("售出一张票");
    }
}
