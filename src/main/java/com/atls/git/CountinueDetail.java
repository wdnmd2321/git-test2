package com.atls.git;

public class CountinueDetail {
    public static void main(String[] args) {
        abc1:
        for (int j = 0;j<2;j++){
            abc2:
            for (int i = 0;i<10;i++){
                if (i==2){
                    continue ;
                }
                System.out.println("i="+i);
            }
        }

    }
}
