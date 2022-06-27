package com.atls.test;

import java.util.Scanner;

public class If03 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入保国同志信用分(1-100)");
        double score = myScanner.nextDouble();
        if (score >= 1 && score <= 100) {
            if (score == 100) {
                System.out.println("保国同志信用极好");


            } else if (score > 80 && score <= 99) {
                System.out.println("保国同志信用优秀");
            } else if (score >= 60 && score <= 80) {
                System.out.println("保国同志信用一般");
            } else {
                System.out.println("保国同志信用不及格，上征信");
            }
        }else{

            System.out.println("信用分需要在1-100，请重新输入");


        }
    }
}