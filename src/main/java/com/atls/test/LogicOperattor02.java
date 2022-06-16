package com.atls.test;

public class LogicOperattor02 {
    public static void main(String[] args) {
        //||短路或 和 |逻辑或
        // || 规则：两个条件中只要有一个成立，结果为true否则为falise
        //| 规则：两个条件中只要有一个成立，结果为true 否则为flase
        int age = 69;
        if (age > 20 || age < 30){
            System.out.println("ok100");
        }
        //&逻辑与使用
        if (age > 20 | age <30){
            System.out.println("ok200");
           // 1) ||短路或:如果第一个条件为true,则第二个条件不会判断，最终结果为true,效率高
            //2) |逻辑或:不管第一个条件是否为true,第二个条件都要判断，效率低
            //3)开发中，我们基本使用||
            int a = 4;
            int b = 9;
            if (a > 1 || ++b > 4){//可以换成|测试
                System.out.println("ok300");
            }
            System.out.println("a=" +a+"b="+ b);
        }
    }
}
