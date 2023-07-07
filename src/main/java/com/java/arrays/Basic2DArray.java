package com.java.arrays;

public class Basic2DArray {

 /*  syntax for multi-dimensional array :
    1. int[][] arr;
    2. int   [][]arr;
    3. int   arr[][];
    4. int   []arr[];
  */

    //to print 2-D array

    public static void main(String[] args) {

        // valid     int []a,b[];
        // invalid   int []a,[]b;
        // valid     int a,b[][];
        //invalid    int a[],[]b;


//        int arr[][] = {{2, 2}, {3, 3}};
//
//        for (int i = 0; i < 2; i++) {
//            for (int j = 0; j < 2; j++) {
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//
//        }

//

        int a[] = {10, 20, 30, 40, 50};
        int b[] = {60, 70};
       // b = a;
        a=b;
        for (int i = 0; i < a.length; i++) {
                System.out.print(a[i] + " ");

            }
            System.out.println();

        for (int i = 0; i < b.length; i++) {

            System.out.print(b[i] + " ");
        }


    }
    }

