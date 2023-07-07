package com.java.arrays;

public class BasicArrays {



    /*
    Syntax for array 3 ways :
     1. datatype[]   arr;
     2. datatype   []arr;
     3. datatype     arr[];
     */


    // basic example to declare, instantiate, initialise and traverse the array
    // also remember if no value is provided by default it will consider '0' value

    public static void main(String[] args) {

      //  int arr[2] ={1,2}; --- wrong way of initialisation
//        int a[] = new int[5];
//        a[0] = 20;
//        a[1] = 30;
//        a[4] = 60;
//
        int a[] ={25,35,45};

        for (int i = 0; i <a.length ; i++) {
            System.out.println(a[i]);

        }
    }


}
