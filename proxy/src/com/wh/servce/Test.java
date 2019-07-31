package com.wh.servce;

/**
 * Test
 *
 * @author wangheng
 * @date 2019/7/31
 */

import com.wh.demo.ISaleTecket;
import com.wh.demo.SaleTecket;
import com.wh.demo.SaleTextProxy;

/**
 * 静态代理模式
 * 特点：业务类和代理类必须实现相同接口
 *       代理类必须有被业务类实现的对象引用
 * */
public class Test {
    public static void main(String[] args) {
        ProxyBeanFactory factory=new ProxyBeanFactory();
      IUserLogin iUserLogin=new User();
     IUserLogin iUserLogin1= (IUserLogin) factory.newProxy(iUserLogin);
      iUserLogin1.login("张三", "123");
//       ISaleTecket iSaleTecket= (ISaleTecket) factory.newProxy(new SaleTextProxy(new SaleTecket()));
//        iSaleTecket.sale();
    }
}
