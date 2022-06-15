package com.atls.git;

public class Test06 {
    public static void main(String[] args) {
        /*
        求出1-1/2+1/3-1/4...1/100的和
        思路
        1,1-1/2+1/3-1/4...1/100 =1-1/2+1/3-1/4...1/100
        2，分析看出
        （1）一共有100个数，分子为1.分母从1-100
        （2）还发现当分母为奇数时，前面是+，当分母是偶数时 前面是-
        （3）我们可以使用for + 判断完成
        4 把结果存放到double sum
         */
        double sum = 0;
        for (int i = 1;i <= 100;i++){
            //判断奇数还是偶数

            if (i % 2 != 0){//分母为奇数
                sum +=1.0/i;
            }else{//分母为偶数
                sum -= 1.0/i;
            }
        }
        System.out.println("sum=" +sum);
    }

}