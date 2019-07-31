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
 *动态代理
 * 要求：
 * */
public class Test {
    public static void main(String[] args) {
//        ProxyBeanFactory factory=new ProxyBeanFactory();
//      IUserLogin iUserLogin=new User();
//     IUserLogin iUserLogin1= (IUserLogin) factory.newProxy(iUserLogin);
//      iUserLogin1.login("张三", "123");
//       ISaleTecket iSaleTecket= (ISaleTecket) factory.newProxy(new SaleTextProxy(new SaleTecket()));
//        iSaleTecket.sale();
        CglibProxyFactory factory=new CglibProxyFactory();
        NewsServce newsServce=new NewsServce();
       NewsServce servce= (NewsServce) factory.newProxyBean(newsServce);
   servce.news();
    }
}
