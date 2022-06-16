package com.atls.test;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class RelationalOperator {
    public static void main(String[] args) {
        int a=9;//开发中 不可以使用a,b n1..
        int b=8;
        System.out.println(a>b);//T
        System.out.println(a>=b);//T
        System.out.println(a<=b) ;//F
        System.out. println(a<b) ;//F
        System.out.println(a==b);//F
        System.out.println(a!=b);//T
        boolean flag = a > b; //T
        System.out.println("flag=" + flag);
    }
}
