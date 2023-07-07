package com.java.basicexamples;

import java.util.Scanner;

public class FactorialSeries {

    // using recursion
 /*
    static int factorial(int n) {

        if (n==0)
            return 1;
        else
            return (n * factorial(n - 1));
    }

    public static void main(String[] args) {
        int fact, number;
        Scanner n = new Scanner(System.in);
        System.out.println("Enter a number: " );
        number = n.nextInt();
        fact = factorial(number);
        System.out.println(" Factorial of a number is:  "+fact);
    }
*/


    // without recursion

    public static void main(String[] args) {
        int j,number, fact=1;
        number=5;
        for (j = 1; j <=number; j++) {
            fact = fact *j;
        }

        System.out.println(" Factorial of a number is:  "+fact);
    }

}
