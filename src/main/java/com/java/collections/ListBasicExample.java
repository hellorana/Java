package com.java.collections;

import java.util.ArrayList;
import java.util.List;

public class ListBasicExample {

    public static void main(String[] args) {

        List<String> basicList = new ArrayList<>();


        // 1. LIst allows to add duplicate elements
        basicList.add("Hello");
        basicList.add("This is basic");
        basicList.add("List example");
        basicList.add("Hello");

        System.out.println(basicList);

        basicList.remove(3);
        System.out.println(basicList);

        // 2.list allows you to add null elements
        basicList.add(null);
        basicList.add(null);

        System.out.println(basicList);

        // 3.maintains insertion order
        basicList.add("1");
        basicList.add("2");
        basicList.add("3");
        basicList.add("4");

        System.out.println(basicList);

        // 4.access elements from list
        System.out.println(basicList.get(0));
        System.out.println(basicList.get(3));


    }
}