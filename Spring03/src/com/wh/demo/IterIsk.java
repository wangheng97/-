package com.wh.demo;

/**
 * IterIsk
 *
 * @author wangheng
 * @date 2019/7/30
 */
public class IterIsk {
    private Isk isk;
    private Paper paper;
    public  void run(){
        if (isk==null){
            System.out.println("没有墨盒");
        }else {
            isk.show();
        }if (paper==null){
            System.out.println("没有智障");
        }else{
            paper.add();
        }
    }

    public void setIsk(Isk isk) {
        this.isk = isk;
    }

    public void setPaper(Paper paper) {
        this.paper = paper;
    }
}
