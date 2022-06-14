package com.atls.git;

public class Test02 {
    public static void main(String[] args) {
        double money = 100000;//还有多少钱
        int count = 0; //累积过的路口
        while(true){
            if(money > 50000){ //过路口
                //money = money - money *0.05;
                money *= 0.95;//过了这个路口后，还有这么多钱
                count++;

            }else if(money >= 1000 && money <= 50000){
                money -= 1000;
                count++;
            }else {//钱不够
                break;
            }
        }
        System.out.println(money + "可以过" + count +"路口");
    }
}

