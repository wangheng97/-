package com.wh.zuoye;

import java.util.Scanner;

/**
 * Test3
 *
 * @author wangheng
 * @date 2019/7/29
 */
public class Test3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个数");
        int a=sc.nextInt();
        while (a!=0){
            System.out.print(a%10);
            a=a/10;
        }
    }
}
