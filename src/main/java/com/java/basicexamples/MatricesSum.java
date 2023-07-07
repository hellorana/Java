package com.java.basicexamples;

public class MatricesSum {
    public static void main(String[] args) {
        int a[][] = {{1, 2, 3}, {4, 5, 6}, {1,2,3}};
        int b[][] = {{1, 2, 3}, {4, 5, 6}, {1,2,3}};
        int c[][] = new int[3][3];
        int i, j;

        System.out.println(" Sum of two matrix are :");
        for (i = 0; i < 3; i++)
            for (j = 0; j < 3; j++)
                c[i][j] = a[i][j] + b[i][j];

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(+c[i][j]+" ");

                System.out.println();
            }
        }

    }
}