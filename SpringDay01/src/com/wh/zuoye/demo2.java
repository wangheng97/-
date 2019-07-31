package com.wh.zuoye;

import java.util.Scanner;

/**
 * demo2
 *
 * @author wangheng
 * @date 2019/7/29
 */
public class demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生成绩");
        Double d = sc.nextDouble();
    if (d<59){
        System.out.println("不及格");
    }if (d>=60&&d<70){
            System.out.println("及格");
        }if (d>=70&&d<80){
            System.out.println("中等");
        }if (d>=80&&d<90){
            System.out.println("良好");
        }if (d>=90&&d<100){
            System.out.println("优秀");
        }
    }
}
