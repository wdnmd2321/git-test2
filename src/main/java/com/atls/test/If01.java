package com.atls.test;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Scanner;

public class If01 {
    public static void main(String[] args) {
        //if快速入门
        //接收输入的年龄 定义Scannee
        //把年龄保存一个变量 int age
        //使用if 判断 输出对于信息
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入年龄");
        int age = myScanner.nextInt();
        if (age > 18){
            System.out.println("你的年龄大于18，要负法律责任，送入监狱");
        }else{
            System.out.println("你年龄不够 这次放过你");
        }
        System.out.println("程序继续。。。");
    }
}
