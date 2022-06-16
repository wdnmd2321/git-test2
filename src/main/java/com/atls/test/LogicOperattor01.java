package com.atls.test;

public class LogicOperattor01 {
    public static void main(String[] args) {
    /*
        && 和& 案例演示
        &&短路与使用
     */
        int age = 69;
        if (age > 20 && age < 90){
            System.out.println("ok100");
        }
        //&逻辑与使用
        if (age > 20 & age <90){
            System.out.println("ok200");
        }
        //区别
        int a = 4;
        int b = 9;
        //对于&&短路与而言，如果第一个条件为F,后面的条件不再判断
        if (a < 1 && ++b <50){
            System.out.println("ok300");
        }
        System.out.println("a=" +a + "b=" +b);
        if (a < 1 & ++b <50){
            System.out.println("ok400");
        }
    }


}
