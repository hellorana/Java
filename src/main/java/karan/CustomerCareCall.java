package karan;

import java.util.Scanner;

public class CustomerCareCall {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Customer Care Chat Box");
        System.out.println("Thanks for giving us a Chance to Serve you,");
        System.out.println("Please select the appropriate option");
        System.out.println("Enter 1 to Serve you by Call ");
        System.out.println("Enter 2 to visit the office and need office location Info");
        System.out.println("Enter 3 to Serve by Chat Box");
        System.out.println("Enter 4 to give your feedback");
        System.out.println("Please select your option");

        int input=sc.nextInt();
        while(input>4){
            System.out.println("Please select the appropriate option");
            System.out.println("Enter 1 to Serve you by Call ");
            System.out.println("Enter 2 to visit the office and need office location Info");
            System.out.println("Enter 3 to Serve by Chat Box");
            System.out.println("Enter 4 to give your feedback");
            System.out.println("Please select your option");
            input = sc.nextInt();
        }
        switch (input) {
            case 1:
                System.out.println("Enter 1 to drop your number and we will give you call later");
                System.out.println("Enter 2 to know the contact information");
                input = sc.nextInt();
                switch (input) {
                    case 1:
                    System.out.println("Please provide your Contact Number and representative call you back ");
                    input = sc.nextInt();
                    String inputLength= String.valueOf(input);

                    while (inputLength.length()>10 || inputLength.length()<10){
                        System.out.println("Entered value is not acceptable");
                        System.out.println("Contact number should be 10 digit and not start with Zero");
                        input = sc.nextInt();
                    }
                    break;
                    case 2:
                        System.out.println("Please contact us on below's number");
                        System.out.println(" 24hr Toll Free Number: ");
                        System.out.println("     (USA) 1800-0000-0000");
                        System.out.println("     (CAD) 1800-0000-0001");
                        break;
                }
        }
    }
    }

