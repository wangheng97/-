package com.wh.demo1;

/**
 * Computer
 *
 * @author wangheng
 * @date 2019/7/29
 */
public class Computer {
    private  IDisk disk;
    private IDisplay display;
    public void run(){
        System.out.println("启动");
        if(disk==null){
            System.out.println("没有发现硬盘");
        }else {
            disk.work();
        }
        if (display==null){
            System.out.println("没有显示器");
        }else {
            display.show();
        }
        System.out.println("关机");
    }

    public void setDisk(IDisk disk) {
        this.disk = disk;
    }

    public void setDisplay(IDisplay display) {
        this.display = display;
    }
}
