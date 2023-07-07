package com.java.exceptionhandling;


public class BasicExample {

    // basic try-catch example to check order of exceptions
    // an example, to handle the exception without maintaining the order of exceptions (i.e. from most specific to most general)


    public static void main(String[] args) {

        int a[] = new int[5];


        try {
            a[10]=30;
        }

        catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Most specific Exception");
        }
        catch (Exception e) {
            System.out.println("Most General Exception");
        }

        System.out.println("Last statement");
    }
}

