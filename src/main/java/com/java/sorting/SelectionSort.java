package com.java.sorting;

public class SelectionSort {


    public static void selectionSorting(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int index = i;
            for (int j = i + 1; j < n; j++) {

                if (arr[j] < arr[index]) {
                    index = j;
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
    }


    public static void main(String[] args) {
        int[] arr1 = {12, 4, 2, 8};

        System.out.println("Before selection sort ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
            System.out.println();
            selectionSorting(arr1);

            System.out.println("After selection sort ");
            for (int j = 0; j < arr1.length; j++) {
                System.out.print(" " + arr1[j]);

            }
        }
    }
