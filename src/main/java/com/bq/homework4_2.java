package com.bq;

import java.util.Scanner;

public class homework4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入成绩");
        int score = sc.nextInt();

        if (score < 0 || score > 100) {
            System.out.println("输入成绩不合法！");
            sc.close();
            return;
        }

        switch (score / 10) {
            case 10:
            case 9:
                System.out.println("优");
                break;
            case 8:
                System.out.println("良");
                break;
            case 7:
                System.out.println("中");
                break;
            case 6:
                System.out.println("及格");
                break;
            default:
                System.out.println("不及格");
                break;
        }

        sc.close();
    }
}
