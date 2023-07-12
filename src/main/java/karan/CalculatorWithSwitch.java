package karan;


import java.util.Scanner;

public class CalculatorWithSwitch {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Welcome to Calculator");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulus");
        System.out.println( "Enter the value  ");

        int input = scanner.nextInt();

        if(input > 5) {
            System.out.println(" Invalid Entry");
        }
else {
            System.out.println(" Enter the first value");
            int num1 = scanner.nextInt();
            System.out.println(" Enter the second value");
            int num2 = scanner.nextInt();


            switch (input) {
                case 1:
                    int sum = num1 + num2;
                    System.out.println("Sum of the values " + sum);
                    break;
                case 2:
                    int sub = num1 - num2;
                    System.out.println("Sub of the values " + sub);
                    break;
                case 3:
                    int mult = num1 * num2;
                    System.out.println(" Multiplication of the value " + mult);
                    break;
                case 4:
                    double div = num1 / num2;
                    System.out.println("Division of the value " + div);
                    break;
                case 5:
                    int mod = num1 % num2;
                    System.out.println("Modulus of the value " + mod);
                    break;
                default:
                    System.out.println(" Wrong Input");

            }
        }

    }
}
