package karan.July15;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first value");
        int num1=sc.nextInt();
        System.out.println("Enter the second value");
        int num2= sc.nextInt();
        System.out.println("Enter the third value");
        int num3=sc.nextInt();

        Methods_Calculators.sum(num1,num2);
        Methods_Calculators.sum(num1, num2, num3);



    }
}