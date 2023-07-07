package com.java.generics;

public class Basic {

    // basic generic method example

    public static <E> void printArray(E[] inputArray){
        for (E element:inputArray) {
            System.out.print(" Elements of array are "+ element );
        }
        System.out.println();
    }


    public static void main(String[] args) {

      Integer[] intArray = {2,4,6,7};
      Double[] doubleArray={2.2, 3.4, 8.6};

      printArray(intArray);
      printArray(doubleArray);

    }
}
