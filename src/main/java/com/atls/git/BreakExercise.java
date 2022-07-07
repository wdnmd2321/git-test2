package com.atls.git;

public class BreakExercise {
    public static void main(String[] args) {
        //1-100之内的数求和，求出当和 第一次大于20的当前数for+break
        //思路分析
        //1，循环1-100，求和sum
        //2，当sum>20时，记录下当前数，然后break
        //3,在for循环外部，定义变量n，把当前i 赋给n
        int sum = 0;
        int n= 0;
        for (int i = 1;i <= 100;i++){
            sum += i;
            if (sum>20){
                System.out.println("和>20时 当前数i=" +i);
                n = 1;
                break;
            }
        }
        System.out.println("当前数=" +n);
    }
}
