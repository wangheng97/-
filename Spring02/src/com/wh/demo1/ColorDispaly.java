package com.wh.demo1;

/**
 * ColorDispaly
 *
 * @author wangheng
 * @date 2019/7/29
 */
public class ColorDispaly implements IDisplay{
    private  String brand;
    @Override
    public void show() {
        System.out.println("===彩色电视===");
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
