package com.java.extraPractice;

public class TypeCasting {


    public static void main(String[] args) {

        byte b;
        int i = 257;
        double d  = 323.177;
        System.out.println("\n Conversion of int to byte : ");
        b=(byte) i;
        System.out.println("i and b : " +b);

        System.out.println("\n Conversion of double to int");
        i = (int)d;
        System.out.println(" d and i : " +i);

    }
}
