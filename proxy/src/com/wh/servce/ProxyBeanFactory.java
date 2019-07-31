package com.wh.servce;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Date;

/**
 * ProxyBeanFactory
 *
 * @author wangheng
 * @date 2019/7/31
 * 动态代理
 */
public class ProxyBeanFactory implements InvocationHandler {
   private Object obj;
    public Object newProxy(Object obj){
        this.obj=obj;
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(),obj.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(new Date()+""+obj.getClass().getName()+"中的"+method.getName()+"方法被调用了用户名"+"参数"+args[0]+args[1]);
        Object ret=   method.invoke(obj, args);
        System.out.println("登陆结果"+ret);
        return ret;
    }
}
