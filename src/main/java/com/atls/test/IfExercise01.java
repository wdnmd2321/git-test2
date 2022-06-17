package com.atls.test;

public class IfExercise01 {
    public static void main(String[] args) {
        //声明两个double型变量并赋值。判断第一个数大于10.0，且第二个数小于20，打印两数之和
        double n1 = 34;
        double n2 = 16;

        if (n1 >10.0 &&  n2<20){
            System.out.println("两个数和="+(n1 +n2));

        }
        //定义两个变量int，判断二者的和
        //是否能被3又能被5整除
        int d1 = 23;
        int d2 = 34;
        int sum = d1+d2;
        if (sum % 3 == 0 && sum % 5 == 0){
            System.out.println("可以被3且被5整除");

        }else{
            System.out.println("和不能被3和5整除");
        }
        //判断一个年份是否为闰年
        //年份能被4整除，但不能被100整除 能被400整除
        //思路分析
        //定义int year保存年
        // year % 4 ==0 && year % 100 != 0
        int year = 2020;
        if (year % 4 ==0 && year % 100 != 0 || year % 4 ==0){
            System.out.println(year +"为 闰年");
        }else{
            System.out.println(year+"不是闰年");
        }
    }
}
