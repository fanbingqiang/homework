package com.bq;

public class homework4_3 {
    public static void main(String[] args) {
        System.out.println("所有的水仙花数有:");

        for (int i = 100; i <= 999; i++) {
            int hundreds = i / 100;
            int tens = (i / 10) % 10;
            int units = i % 10;

            if (i == (hundreds * hundreds * hundreds) +
                    (tens * tens * tens) +
                    (units * units * units)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}