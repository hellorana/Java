//package karan.July11;
//
//import java.util.Scanner;
//
//public class GreatestNumber {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String input;
//        do {
//            System.out.println("enter the first Number");
//            int first_number = sc.nextInt();
//            System.out.println("enter the second number");
//            int second_number = sc.nextInt();
//            System.out.println("enter the third number");
//            int third_number = sc.nextInt();
//
//            if (first_number > second_number && first_number > third_number) {
//                System.out.println(first_number + " is greater than " + second_number + " and  " + third_number);
//            } else if (second_number > third_number && second_number > first_number) {
//                System.out.println(second_number + " is greater than " + first_number + " and " + third_number);
//            } else if (third_number > first_number && third_number > second_number) {
//                System.out.println(third_number + " is greater than " + first_number + " and  " + second_number);
//            } else {
//                System.out.println("all number are equal");
//                input = sc.next();
//            }
//
//
//    }
//}