package com.java.design.singleton;

public class SingletonObject {

    // create an object/instance of the class
    private static SingletonObject singletonInstance = new SingletonObject();

    // private constructor;
    private SingletonObject(){}

    // method to access instance of the singleton class (the only access point)
    public static SingletonObject getInstance(){
        return  singletonInstance;
    }


    public void showMessage(){
        System.out.println("Hello, this is Singleton Class Object");
    }

    Object jas = new Object();


}
