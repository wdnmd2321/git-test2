package com.atls.git;

public class Test04 {
    /*
    输出1-100之间的不能被5整除的数 每5行一个
    思路
    1，先输出1-100的所有数
    2，然后过滤输出不能被5整除的数 i% 5 !=5
    3,每五个一行 我们使用int count 统计


     */
    public static void main(String[] args) {
        int count = 0;//统计个数
        for (int i = 1;i <= 100;i++){
            if (i % 5 != 0){
                count++;
                System.out.println(i + " ");
                //判断 每满5个，就输出一行
                if (count % 5 ==0){
                    System.out.println();
                }
            }
        }
    }
}
