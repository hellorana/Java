package karan;

import java.util.Scanner;

public class LeapYear
{
    public static void main(String[] args) {
        int x;
        int y;
        int z;
Scanner scanner = new Scanner(System.in);
System.out.println( "enter the first number : ");
x = scanner.nextInt();

System.out.println( "Enter the second number : ");
y = scanner.nextInt();

System.out.println( "Enter the third number :");
z = scanner.nextInt();


        if( x>y && x>z) {
            System.out.println("x ia largest " + x);
        }
         else if( y>x && y>z){
             System.out.println( " Y is largest ");
            }
         else if( z>x && z>y){
             System.out.println( "Z is largest");
        }
        }
    }


