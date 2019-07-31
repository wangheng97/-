package com.wh.demo01;

/**
 * Computer
 *
 * @author wangheng
 * @date 2019/7/29
 */
public class Computer {
    private  Idisplay idisplay;
    private YingPan yingPan;
    public void run(){
        System.out.println("===电脑启动===");
        if (idisplay==null){
            System.out.println("没有发现显示器");
        }else {
            idisplay.show();
        }
        if (yingPan==null){
            System.out.println("没有发现硬盘");
        }else {
            yingPan.du();
        }
        System.out.println("===电脑工作中===");
    }

    public Idisplay getIdisplay() {
        return idisplay;
    }

    public void setIdisplay(Idisplay idisplay) {
        this.idisplay = idisplay;
    }

    public YingPan getYingPan() {
        return yingPan;
    }

    public void setYingPan(YingPan yingPan) {
        this.yingPan = yingPan;
    }
}
