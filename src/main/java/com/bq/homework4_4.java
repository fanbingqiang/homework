package com.bq;

public class homework4_4 {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];

        arr[0][0] = 1;
        for (int j = 1; j < 5; j++) {
            arr[0][j] = arr[0][j - 1] + (j + 1);
        }

        for (int i = 1; i < 5; i++) {
            for (int j = 0; j < 5 - i; j++) {
                arr[i][j] = arr[i - 1][j] - 1;
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.printf("%-4d", arr[i][j]);
            }
            System.out.println();
        }
    }
}
