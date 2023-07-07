package com.java.design.singleton;

import com.java.design.singleton.SingletonObject;

public class SingletonPattern {

    public static void main(String[] args) {

       // since constructor is private we cannot instantiate i.e
        // SingletonObject object = new SingletonObject();


        // get the only object available
        SingletonObject object = SingletonObject.getInstance();
        object.showMessage();
    }
}
