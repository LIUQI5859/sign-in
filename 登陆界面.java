package com.itheima;

import java.util.Scanner;

public class 登陆界面 {
    public static void main(String[] args) {

        String username = "QXDYXPZ";
        String password = "tbontb,.666";

        for (int i=0;i<3;i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入您的用户名:");
            String name = sc.nextLine();
            System.out.println("请输入密码：");
            String psd = sc.nextLine();

            if (username.equals(name) && password.equals(psd)) {
                System.out.println("登陆成功");
                break;
            }else {
                if (2-i == 0) {
                    System.out.println("您的账号已被锁定，请联系管理员");
                }else {
                    System.out.println("登陆失败，您还有" + (2-i) + "次机会");
                }
            }
        }
    }
}
