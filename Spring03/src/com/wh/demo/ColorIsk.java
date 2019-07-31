package com.wh.demo;

/**
 * ColorIsk
 *
 * @author wangheng
 * @date 2019/7/30
 */
public class ColorIsk implements Isk {
    private String brand;
    public ColorIsk(){

    }
    public ColorIsk(String brand) {
        this.brand = brand;
    }

    @Override
    public void show() {
        System.out.println(brand+"++++++=="+"黑白磨合");
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
