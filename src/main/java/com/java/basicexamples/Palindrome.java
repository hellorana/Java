package com.java.basicexamples;

import java.util.Scanner;

public class Palindrome {

    static void checkPalindrome(int n) {
        int r, sum = 0;
        int temp = n;

        while (n > 0) {
            r = n % 10;
            sum = (sum * 10) + r;
            n = n / 10;
        }
            if (temp == sum)
                System.out.println(temp + " is a palindrome number");
             else
                System.out.println(temp + " is not a palindrome");
        }

    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = number.nextInt();
        checkPalindrome(n);

    }
}
