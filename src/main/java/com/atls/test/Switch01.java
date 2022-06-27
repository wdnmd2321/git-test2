package com.atls.test;
import java.util.Scanner;

public class Switch01 {
    /*
        编写一个程序，该程序可以接受一个字符 比如abcdefg
        a表示星期一 b表示星期二
        根据用户输入显示相应的信息
        思路分析
        1，接收一个字符，并创建Scanner对象
        2，使用Switch来完成匹配，并输出对应的信息


         */
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入一个字符");
        char c1 = myScanner.next().charAt(0);
        switch (c1){
            case 'a':
                System.out.println("今天是星期一，老六穿新衣");
                break;
            case 'b':
                    System.out.println("今天星期二。老六穿花衣");
                    break;
            case 'c':
                        System.out.println("今天星期三，老六爬雪山");
                        break;
                        //...
            default:
                System.out.println("你输入的字符不正确，没有匹配");
        }
        System.out.println("结束了...");

    }
}
