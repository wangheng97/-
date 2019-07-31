package com.wh.demo1;

/**
 * B
 *
 * @author wangheng
 * @date 2019/7/30
 */
public class B {
    private A a;
    public B(){
        System.out.println(a+"===B===");
    }

    public void setA(A a) {
        this.a = a;
    }

    @Override
    public String

    toString() {
        return "B{" +
                "a=" + a +
                '}';
    }
}
