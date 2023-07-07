package com.java.basicexamples;

import java.util.Scanner;

public class Armstrong {

    static void checkArmstrong(int n) {
        int temp = n;
        int sum = 0, r;

        while (n > 0) {
            r = n % 10;
            sum = sum + (r * r * r);
            n = n / 10;
        }
            if (temp == sum) {
                System.out.println(temp + " is an armstrong number");
            } else

                System.out.println(temp + " is not an armstrong number");

        }


    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = number.nextInt();
        checkArmstrong(n);
    }

}
