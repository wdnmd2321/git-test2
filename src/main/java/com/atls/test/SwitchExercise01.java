package com.atls.test;

public class SwitchExercise01 {
    /*
    对学生成绩大于60分，输出“合格”低于60分，输出“不合格”（输出成绩不能大于100） 提示成绩/60
    思路分析
    1，要求使用switch
    2进行转换，
    如果成绩在【60.100】，int(成绩/60) = 1
    如果成绩在【0.60】，（int）(成绩/60) = 0

     */
    public static void main(String[] args) {


        double score = 88.5;
        if (score >= 0 && score <= 0) {


            switch ((int) (score / 60)) {
                case 0:
                    System.out.println("不合格");
                    break;
                case 1:
                    System.out.println("合格");
                    break;
                //default:
                //   System.out.println("输入有误");


            }

        } else {
            System.out.println("输入的成绩要在0-100之间");
        }

    }
}



