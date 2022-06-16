package com.atls.test;

public class InverseOperator {
    public static void main(String[] args) {
        //!操作是取反 T->F, F->T
        System.out.println(60>20);
        System.out.println(!(60>20));
        //a^b: 叫逻辑异或，当a和b 不同时 结果T 否则F
        boolean b = (10 >1)^(3>5);
        System.out.println("b=" +b);
    }
}
