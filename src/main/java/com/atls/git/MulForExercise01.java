package com.atls.git;
import java.util.Scanner;

public class MulForExercise01 {
    public static void main(String[] args) {
        //统计三个班成绩情况，每个班有5各学生
        //求各个班级的平均分和所有班级的平均分
        //统计三个班级及格人数，每个班5人
        Scanner myScanner = new Scanner(System.in);
        double totalScore = 0;
        int passNum = 0;
        int classNum= 3;
        int stuNum = 5;
        for (int i = 1; i <= classNum; i++) {

            double sum = 0;
            for (int j = 1; j <= stuNum; j++) {
                System.out.println("请数第"+i+"个班的第" + j + "个学生的成绩");
                double score = myScanner.nextDouble();
                if (score >= 60){
                    passNum++;
                }
                sum += score;
                System.out.println("成绩为" + score);
            }
            //sum 是5个学生的总成绩
            System.out.println("sum=" + sum + "平均分" + (sum / stuNum));
            totalScore += sum;
        }
        System.out.println("三个班总分="+totalScore + "平均分="
                                        +totalScore /(classNum*stuNum));
        System.out.println("及格人数=" +passNum);
    }
}
