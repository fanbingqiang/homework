package com.bq;
import java.util.Scanner;

public class homework4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入H与R");
        double r = sc.nextDouble();
        double h = sc.nextDouble();

        double v = Math.PI * r * r * h;

        System.out.println("体积 = " + v);

        sc.close();
    }
}
