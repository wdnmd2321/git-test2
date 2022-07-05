package com.atls.git;

public class DoWhile03 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        do {
            System.out.println("sum=" +sum);
            i++;
            sum += i;

        }while (i <= 100);

    }

}
