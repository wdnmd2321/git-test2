package com.atls.git;
import java.util.Scanner;

public class BreakExercise02 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String name = "";
        String passwd = "";
        int chance = 3;
        for (int i = 1;i <=3; i++){
            System.out.println("请输入名字");
            name = myScanner.next();
            System.out.println("请输入密码");
            passwd = myScanner.next();
            //比较输入的名字和密码是否正确
            //补充说明字符串 的比较 使用 的方法equals
            if ("一眼顶针".equals(name) && "666".equals(passwd)){
                System.out.println("恭喜你，登录成功~");
                break;
            }
            //登录的机会就减少一次
            chance--;
            System.out.println("你还有"+chance+"次登录机会");
        }



    }
}
