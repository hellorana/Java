package karan;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Welcome to Sweet Home");
        System.out.println("1. Fan");
        System.out.println("2. Bulb");
        System.out.println("3. TV");
        System.out.println("4. nothing");
        System.out.println( "Enter the value  ");

        int input = scanner.nextInt();

        switch(input){
            case 1 :
                System.out.println(" Switch ON the Fan");
                break;
            case 2 :
                System.out.println(" Switch ON the Bulb");
                break;
            case 3 :
                System.out.println(" Switch ON the TV");
                break;
            case 4:
                System.out.println( " Switch ON nothing");
                break;
            default:
                System.out.println( "wrong input");

        }
    }
}
