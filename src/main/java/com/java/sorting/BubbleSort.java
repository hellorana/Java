package com.java.sorting;

public class BubbleSort {

    static void bubbleSorting(int[] arr)
    {
        int n, temp;
        n = arr.length;
        for (int i = 0; i <n ; i++) {
            for (int j = 1; j <n-i ; j++) {
// swap elements
                if(arr[j-1] > arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }

            }

        }

    }

    public static void main(String[] args) {
 int arr[] ={2,6,9,1,5};

        System.out.println(" Array before bubble sort");

        for (int i = 0; i <arr.length ; i++) {
            System.out.print(" " +arr[i]);

        }

        System.out.println();

        bubbleSorting(arr);

        System.out.println(" Array after bubble sort");

        for (int i = 0; i <arr.length ; i++) {
            System.out.print(" " +arr[i]);

        }
    }
}
