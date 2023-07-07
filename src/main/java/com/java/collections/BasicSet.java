package com.java.collections;

import java.util.HashSet;
import java.util.Set;

public class BasicSet {

    public static void main(String[] args) {


        Set<String> words = new HashSet<>();
        words.add("jashan");
        words.add("please ");
        words.add("work hard");
        words.add("jashan");
        System.out.println(words);

        Set<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(4);
        numbers.add(6);
        numbers.add(1);

        System.out.println(numbers);

    }
}
