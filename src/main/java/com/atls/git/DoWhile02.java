package com.atls.git;

public class DoWhile02 {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        do {
            System.out.println("i=" +i);
            i++;
            sum++;
        }while (i<=100);
        System.out.println("sum="+sum);
    }
}
