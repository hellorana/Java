package com.java.generics;

import java.util.SortedMap;

public class SwapExample {

    public static <T> void swapArray(T[] arr, int i, int j){
        T temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        for (T elem:arr)
        {
            System.out.print("After swap array " +elem);
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Integer[] arr = {10,20,30};
        int i =1;
        int j =2;

        for (int print:arr) {
            System.out.print("Before Swap array : " + print);
        }
        System.out.println();

        swapArray(arr,i,j);

    }


}
