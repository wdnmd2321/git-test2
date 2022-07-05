package com.atls.git;
import java.util.Scanner;

public class DoWhileExercise02 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        char answer = ' ';
        do {
            System.out.println("李三使出五连鞭");
            System.out.println("李三问：还钱吗？y/n");
            answer = myScanner.next().charAt(0);
            System.out.println("他的回答是" +answer);
        }while (answer != 'y');
        System.out.println("老韩还钱了");

    }
}
