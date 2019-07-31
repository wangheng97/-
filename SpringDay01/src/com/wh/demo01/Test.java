package com.wh.demo01;

/**
 * Test
 *
 * @author wangheng
 * @date 2019/7/29
 */
public class Test {
    public static void main(String[] args) {
        Computer computer=new Computer();
        GrayDispaly grayDispaly=new GrayDispaly();
        YPHigh ypHigh=new YPHigh();
        computer.setIdisplay(grayDispaly);
        computer.setYingPan(ypHigh);
        computer.run();
    }
}
