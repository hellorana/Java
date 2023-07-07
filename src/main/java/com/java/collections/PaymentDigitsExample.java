package com.java.collections;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ThreadLocalRandom;

public class PaymentDigitsExample {

    public static void main(String[] args) {

        Set<Integer> uniqueNumber = new TreeSet<>();

        for (int i = 0; i < 4; ) {

            int randomNumber = ThreadLocalRandom.current().nextInt(1, 16);
            if (uniqueNumber.add(randomNumber)) {
                i++;
            }

        }
        System.out.println(uniqueNumber);
    }
}