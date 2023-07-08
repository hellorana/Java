package karan;

import java.util.Scanner;

public class CalculatorNew {
    public static void main(String[] args) {
        System.out.println("Welcome to calculator");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Input");
        System.out.println("Enter 1 for Addition");
        System.out.println("Enter 2 subtraction");
        System.out.println("Enter 3 for Multiplication");
        System.out.println("Enter 4 for Division");
        System.out.println("Enter 5 for modulus");
        System.out.println( "Enter the value");

        int input = scanner.nextInt();

        if (input == 1) {
            System.out.println("Enter the first Number  ");
            int num1 = scanner.nextInt();
            System.out.println("Enter the second value   ");
            int num2 = scanner.nextInt();
            int sum = num1 + num2;
            System.out.println("Sum of two number " + sum);
        } else if (input == 2) {
            System.out.println("Enter the first Number  ");
            int num1 = scanner.nextInt();
            System.out.println("Enter the second value  ");
            int num2 = scanner.nextInt();
            int sub = num1 - num2;
            System.out.println("Subtraction of two number " + sub);
        } else if (input == 3) {
            System.out.println("Enter the first Number ");
            int num1 = scanner.nextInt();
            System.out.println("Enter the second value ");
            int num2 = scanner.nextInt();
            int mult = num1 * num2;
            System.out.println("Multi of two number  " + mult);
        } else if (input == 4) {
            System.out.println("Enter the first Number ");
            int num1 = scanner.nextInt();
            System.out.println("Enter the second value  ");
            int num2 = scanner.nextInt();
            int divide = num1 / num2;
            System.out.println("Division of two number " + divide);
        } else if (input == 5) {
            System.out.println("Enter the first Number ");
            int num1 = scanner.nextInt();
            System.out.println("Enter the second value ");
            int num2 = scanner.nextInt();
            int mod = num1 % num2;
            System.out.println("Modulus of two number " + mod);
        }

    }
}