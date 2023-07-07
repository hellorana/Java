package com.java.statements;

import java.util.ArrayList;
import java.util.List;

public class ForEachLambda {

    // It is used to iterate over elements of an array and the collection.

    public static void main(String[] args) {

        List<Integer> numList = new ArrayList<>();

        numList.add(10);
        numList.add(20);
        numList.add(30);
        numList.add(40);


        // lambdas
        numList.forEach(item -> System.out.println(item));

        // method references
        numList.forEach(System.out::println);
    }
}
