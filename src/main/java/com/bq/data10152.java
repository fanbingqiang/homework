package com.bq;

import java.util.Scanner;

public class data10152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("字符串1");
        String str1 = sc.nextLine();
        System.out.println("字符串2");
        String str2 = sc.nextLine();

        int n = str1.length();

        if(str1.equals(str2)) {
                System.out.println("相等");
            }else{
                System.out.println("不相同");
            }
        }

    }
