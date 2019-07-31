package com.wh.servce;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * CglibProxyFactory
 *
 * @author wangheng
 * @date 2019/7/31
 */
public class CglibProxyFactory implements MethodInterceptor {
    public Object newProxyBean(Object object){
        Enhancer enhancer=new Enhancer();
        enhancer.setSuperclass(object.getClass());
        enhancer.setCallback(this);
       Object proxy= enhancer.create();
        return proxy;
    }
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("增强前");
        Object object=  methodProxy.invokeSuper(o, objects);
        System.out.println("增强后");
        return object;
    }
}
