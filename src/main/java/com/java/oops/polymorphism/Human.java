package com.java.oops.polymorphism;


// example of Method Overriding or Dynamic Polymorphism or Dynamic binding or Late Binding or Runtime Polymorphism


public class Human {

        //Overridden method
        public void eat()
        {
            System.out.println("Human is eating");
        }
    }

    class Boy extends Human{

    //Overriding method
        public void eat(){
            System.out.println("Boy is eating");
        }

        Boy(){
            super();
            System.out.println(" Calling Parent class method eat under child class constructor");
        }

        public static void main( String args[]) {
            Boy obj = new Boy();
            //This will call the child class version of eat()
            obj.eat();


            Human obj2 = new Boy();
            //This will also call the child class version of eat()
            obj2.eat();
        }
    }

