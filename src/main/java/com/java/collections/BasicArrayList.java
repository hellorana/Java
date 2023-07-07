package com.java.collections;

import java.util.*;

public class BasicArrayList {

    public static void main(String[] args) {

//        List<String> names = new ArrayList<>();
//
//        // add, set, remove
//        names.add("Jashan");
//        names.add("Karan");
//        names.add("Satvir");
//        names.add("Jaya");
//        names.add("Ravinder");
//
//        System.out.println(names);
//
//        names.set(2, "Love");
//        System.out.println(names);
//
//        names.remove(2);
//        System.out.println(names);
//
//        System.out.println("* * * * * * * * *");
//        // iterate ( iterator() or listIterator() )
//
//
//        // allows null values
//        List<String> nullValues = new ArrayList<>();
//        nullValues.add(null);
//        nullValues.add(null);
//        System.out.println(nullValues);
//
//        // allows duplicate values
//        List<Integer> duplicateValues = new ArrayList<>();
//        duplicateValues.add(1);
//        duplicateValues.add(2);
//        duplicateValues.add(1);
//        System.out.println(duplicateValues);
//
//
//        //Iterating over an ArrayList
//
///* ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5));
//
//        Iterator<Integer> digitsIterator = numbers.iterator();
//        while (digitsIterator.hasNext()){
//            System.out.println(digitsIterator.next());
//        }
//
//*/

        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Grapes");
        fruits.add("Pineapple");
        fruits.add("Oranges");
        fruits.add("Watermelon");

        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

        //forEach
        System.out.println("Iterator using forEach and lambda : ");
        fruits.forEach(fruit -> System.out.println(fruit));

        // sorting
        fruits.sort(new Comparator<String>() {
            @Override
            public int compare(String f1, String f2) {
                return f1.compareTo(f2);
            }
        });


        // sort using lambda expression

        fruits.sort((fruit1, fruit2)-> fruit1.compareTo(fruit2));
        System.out.println("sorted fruits " +fruits);


    }

}