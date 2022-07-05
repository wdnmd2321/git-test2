package com.atls.test;

public class ForExercise {
    public static void main(String[] args) {
        //打印1-100之间所有是9的倍数，统计个数及总和
        //编程技巧
        //1，化繁为简 将复杂的需求拆解成简单的需求逐步完成
        //2，先死后活 先考虑固定的值，然后转成可以灵活变化的值
        //思路分析
        //（1）输出1-100的值
        //(2) 在输出的过程中进行一个过滤 只输出9的倍数
        //(3) 统计个数 定义一个变量count=0 当条件满足时count++;
        //(4)总和 定义一个变量int sum=0 当条件满足时累积 sum+= i;
        int count = 0;//统计9倍数的个数 变量
        int sum = 0;
        int start = 10;
        int end = 200;
        int t = 5;
        for (int i = start;i<=end;i++){
            if (i % t == 0){


            System.out.println("I=" +i);
            count++;
            sum += i;
        }
    }
        System.out.println("count="+count);
        System.out.println("sum="+sum);
}
}
