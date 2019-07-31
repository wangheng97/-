package com.wh.demo1;

/**
 * HighDisk
 *
 * @author wangheng
 * @date 2019/7/29
 */
public class HighDisk implements IDisk{
    private  float size;

    @Override
    public void work() {
        System.out.println("===1T硬盘===");
    }

    public void setSize(float size) {
        this.size = size;
    }
}
