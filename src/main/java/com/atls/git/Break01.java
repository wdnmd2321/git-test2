package com.atls.git;

public class Break01 {
    public static void main(String[] args) {
        //测试代码
        for (int i =0;i <10;i++){
            if (i==3){break;}
            System.out.println("ok"+ i );
        }
        System.out.println("退出for循环，继续执行");

    }
}
