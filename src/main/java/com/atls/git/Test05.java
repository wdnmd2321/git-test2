package com.atls.git;

public class Test05 {
    public static void main(String[] args) {
        //输出小写的a-z以及大写的Z-A
        //考察我们对a-z编码和for的综合运用
        //思路
        //1,‘b’='a' + 1 c = 'a' +2
        //2,,使用for搞定
        for (char c1 = 'a';c1 <= 'z';c1++){
            System.out.println(c1 +" ");

        }
            for (char c2 = 'A';c2 <= 'Z';c2++){
                System.out.println(c2 +" ");
        }

    }
}
