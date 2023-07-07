package com.java.arrays;

public class ArrayCopying {

    public static void main(String[] args) {

        // source array
        char from[] = {'a','j','a','s','h','a','n'};

        // destination array
        char to[] = new char[6];

        System.arraycopy(from,1,to,0,6);

        System.out.println(to);
    }
}
