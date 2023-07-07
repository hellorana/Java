package com.java.basics;

// Difference between static methods and instance methods

public class MethodTypes {
    // taking example of Student class with variables student name, college name and roll ni

    int rollNumber;
    String studentName;
    static String collegeName = "Punjab University";

    public MethodTypes(int rollNumber, String studentName) {
        this.rollNumber = rollNumber;
        this.studentName = studentName;
    }

    // Static method : static means it belongs to class, any changes made will reflect to all other instances. To invoke or call static method we
    // do not need to create object, we can directly access it
    static void changeName(){
        collegeName = "PEC";
    }

    //Instance Method : to call or invoke instance method we first need to create object and then we can access it
    void display()
    {
        System.out.println(" College Name:" + collegeName + ", Student Name:" + studentName + ", Roll Number:"+ rollNumber);
    }

    public static void main(String[] args) {
        changeName(); // calling static method without creating objects
        MethodTypes student1 = new MethodTypes(100, "Jashan");
        MethodTypes student2 = new MethodTypes(200, "Karan");

        //calling instance method by creating objects of a class
        student1.display();
        student2.display();

    }

}
