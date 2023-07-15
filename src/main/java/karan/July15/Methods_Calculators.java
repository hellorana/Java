package karan.July15;

import java.util.Scanner;

public class Methods_Calculators {
    public static void main(String[] args) {

    }

    public static void calculator_switch() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Calculator");
        System.out.println(" + (Addition)");
        System.out.println(" - (Subtraction)");
        System.out.println(" * (Multiplication)");
        System.out.println(" / (Division)");
        System.out.println(" % (Modulus)");
        System.out.println(" Enter Character for Operation  ");

        char input = scanner.next().charAt(0);
        if (input != '+' && input != '-' && input != '*' && input != '/' && input != '%') {
            System.out.println("Wrong Character");
        } else {

            System.out.println(" Enter the first value");
            int num1 = scanner.nextInt();
            System.out.println(" Enter the second value");
            int num2 = scanner.nextInt();


            switch (input) {
                case '+':
                    int sum = num1 + num2;
                    System.out.println("Sum of the values " + sum);
                    break;
                case '-':
                    int sub = num1 - num2;
                    System.out.println("Sub of the values " + sub);
                    break;
                case '*':
                    int mult = num1 * num2;
                    System.out.println(" Multiplication of the value " + mult);
                    break;
                case '/':
                    int div = num1 / num2;
                    System.out.println("Division of the value " + div);
                    break;
                case '%':
                    int mod = num1 % num2;
                    System.out.println("Modulus of the value " + mod);
                    break;
                default:
                    System.out.println(" Wrong Input");


            }
        }
    }


    public static void calculator_switch_three() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Calculator");
        System.out.println(" + (Addition)");
        System.out.println(" - (Subtraction)");
        System.out.println(" * (Multiplication)");
        System.out.println(" / (Division)");
        System.out.println(" % (Modulus)");
        System.out.println(" Enter Character for Operation  ");

        char input = scanner.next().charAt(0);
        if (input != '+' && input != '-' && input != '*' && input != '/' && input != '%') {
            System.out.println("Wrong Character");
        } else {

            System.out.println(" Enter the first value");
            int num1 = scanner.nextInt();
            System.out.println(" Enter the second value");
            int num2 = scanner.nextInt();
            System.out.println( "Enter the third value ");
            int num3 = scanner.nextInt();


            switch (input) {
                case '+':
                    int sum = num1 + num2 + num3;
                    System.out.println("Sum of the values " + sum);
                    break;
                case '-':
                    int sub = num1 - num2;
                    System.out.println("Sub of the values " + sub);
                    break;
                case '*':
                    int mult = num1 * num2* num3;
                    System.out.println(" Multiplication of the value " + mult);
                    break;
                case '/':
                    int div = num1 / num2;
                    System.out.println("Division of the value " + div);
                    break;
                case '%':
                    int mod = num1 % num2;
                    System.out.println("Modulus of the value " + mod);
                    break;
                default:
                    System.out.println(" Wrong Input");


            }
        }
    }
    public static void sum(int num1, int num2){
        int sum = num1 + num2;
        System.out.println("Sum of First two values: " +sum);

    }
    public static void sum(int num1, int num2, int num3) {
        int sum = num1+num2+num3;
        System.out.println("Sum of all three value: "+sum);
    }
}