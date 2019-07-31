package com.wh.demo;

/**
 * A4Paper
 *
 * @author wangheng
 * @date 2019/7/30
 */
public class A4Paper implements Paper {
    private int width;
    private int heigth;

    public A4Paper(int width, int heigth) {
        this.width = width;
        this.heigth = heigth;
    }
    public A4Paper(){}
    @Override
    public void add() {
        System.out.println("A4智障"+width+"++++"+heigth);
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeigth(int heigth) {
        this.heigth = heigth;
    }
}
