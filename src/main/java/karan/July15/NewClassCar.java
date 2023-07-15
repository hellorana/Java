package karan.July15;

import java.util.Scanner;

public class NewClassCar {
    String sizetype = "SUV";
    String colour= "Red";
    String fueltype= "Diesel";
    String drive= "Front wheel";

public void sumofwheel() {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the number of wheels on the car");
    int num1= scanner.nextInt();
    System.out.println("Enter the number of spare wheels");
    int num2= scanner.nextInt();
    int sum= num1 + num2;
    System.out.println("Total number of wheels : " +sum);

}
}
