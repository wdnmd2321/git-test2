package com.atls.git;
import java.util.Scanner;
public class HomeWork03 {
    public static void main(String[] args) {
        //判断一个年份是否为闰年
        System.out.println("请输入年份");
        int year;
        Scanner myScanner = new Scanner(System.in);
        year = myScanner.nextInt();

        if (year<0 || year>3000){
            System.out.println("年份有误，请重新输入");
        }
        if ((year % 4 == 0) && (year % 100 !=0||(year % 400==0))){
            System.out.println(year +"是闰年");
        }else{
            System.out.println(year+"不是闰年");
        }

    }
}
