package com.java.basics;

public class VariableTypes {


    /* Instance Variables or Non-Static Variables:
      1. declared outside methods, blocks or constructors
      2. can be accessed only by creating objects
      3. are non-static fields i.e declared without static modifier
      4. their values are unique to each instance of the class
      5. changes made to the variable don't reflect in other instances of that class

      Static Variables or Class Variables:
      1. declared with static modifier
      2. declared outside methods, blocks or constructors
      3. there is exactly one copy of this variable in existence, regardless of how many times
      the class has been instantiated i.e all instances of the class share the same static variable
      4. If changes are made to that variable, all other instances will see the effect of the changes
      */

    int instanceVariable = 10;
    static int staticVariable = 20;
    int i;

    public static void main(String[] args) {

        VariableTypes obj = new VariableTypes();
        //int i;
        System.out.println("Default value of int i : " + obj.i);

        // instance variables is called by creating object
        System.out.println(" Instance variable is " + obj.instanceVariable);

        // static variable can be called without creating object
        System.out.println(" Static Variable is " + staticVariable);


        // to check static or class variables
        VariableTypes obj1 = new VariableTypes();
        VariableTypes obj2 = new VariableTypes();
        VariableTypes obj3 = new VariableTypes();

        // to access static variables we do not need to create objects(if calling under static methods),
        // but to access non-static variables we need to create objects

        System.out.println("Static Variable directly accessible without creating object " + staticVariable);

        System.out.println("Static Variable for obj1 " + obj1.staticVariable);
        System.out.println("Static Variable for obj2 " + obj2.staticVariable);


        obj1.staticVariable = 110893;
        System.out.println("Static Variable for obj1 " + obj1.staticVariable);
        System.out.println("Static Variable for obj2 " + obj2.staticVariable);

        obj2.staticVariable = 11;
        System.out.println("Static Variable for obj2 " + obj1.staticVariable);
        System.out.println("Static Variable for obj2 " + obj2.staticVariable);
        System.out.println("Static Variable for obj3 " + obj3.staticVariable);





        // to check instance variables
        System.out.println("Static Varibale for obj1 " + obj1.instanceVariable);
        System.out.println("Static Varibale for obj2 " + obj2.instanceVariable);
        System.out.println("Static Varibale for obj3 " + obj3.instanceVariable);

        obj1.instanceVariable = 100000;
        obj2.instanceVariable = 181092;
        obj3.instanceVariable = 110893;


        System.out.println("Static Varibale for obj1 " + obj1.instanceVariable);
        System.out.println("Static Varibale for obj2 " + obj2.instanceVariable);
        System.out.println("Static Varibale for obj3 " + obj3.instanceVariable);



    }


}
