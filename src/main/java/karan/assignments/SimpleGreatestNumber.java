package karan.assignments;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SimpleGreatestNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first number");
        int first_num= sc.nextInt();
        System.out.println("Enter the Second number");
        int second_num= sc.nextInt();
        System.out.println("Enter the third number");
        int third_num = sc.nextInt();

        if(first_num>second_num && first_num>third_num){
            System.out.println((first_num) +"   is the greatest");
        }
        else if(second_num>first_num && second_num>third_num){
            System.out.println((second_num)+"  is the greatest");
        }
        else if(third_num>first_num && third_num>second_num){
            System.out.println((third_num)  + "  is the greatest");
        }
        else {
            System.out.println("All numbers are equal");
        }

    }
}
