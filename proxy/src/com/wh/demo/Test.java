package com.wh.demo;

/**
 * Test
 *
 * @author wangheng
 * @date 2019/7/31
 */
/**
 * 静态代理模式
 * 特点：业务类和代理类必须实现相同接口
 *       代理类必须有被业务类实现的对象引用
 * */
public class Test {
    public static void main(String[] args) {
       // SaleTecket saleTecket=new SaleTecket();
       ISaleTecket saleText=new SaleTextProxy(new SaleTecket());
        saleText.sale();
    }
}
