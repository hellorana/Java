package practice.basics;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        int a,b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number : " );
        a = scanner.nextInt();
        System.out.println("Enter second number : ");
        b = scanner.nextInt();

        Calculator cal = new Calculator();
        String option ;
        System.out.println("Calculator option : " );
        option= scanner.next();

        switch (option) {
            case "add" :
                cal.add(a, b);
            case "divide" :
                cal.divide(a, b);
            case "multiply" :
            cal.multiply(a, b);
            case "subtract" :
            cal.subtract(a, b);
        }

    }

    private void add(int a, int b) {
        double c = a+b;
        System.out.println("Additon of a and b" +c);

    }
    private void subtract(int a, int b) {
        double c = a-b;
        System.out.println("Subtraction of a and b" +c);

    }
    private void multiply(int a, int b) {
        double c = a*b;
        System.out.println("Mulitplication of a and b" +c);

    }
    private void divide(int a, int b) {
        double c = a/b;
        System.out.println("Division of a and b" +c);

    }


}
