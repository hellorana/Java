package com.java.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class BasicLinkedList {

    public static void main(String[] args) {

        // create linkedList
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");
        linkedList.add("d");
        linkedList.addFirst("Letters");
        linkedList.addLast("End");

        System.out.println(linkedList);


        linkedList.remove(0);
        System.out.println(linkedList);

        linkedList.remove("c");
        System.out.println(linkedList);

        // use of iterator
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while(stringListIterator.hasNext())
        {
            System.out.println(stringListIterator.next());
        }

        //iterate using forEach and lambda
        System.out.println("Iterate using java 8 and lambda expression : ");
        linkedList.forEach(name -> System.out.println(name));

        // linkedlist to array

        String[] array = new String[linkedList.size()];
        linkedList.toArray(array);
        System.out.println(Arrays.toString(array));


        // array to linkedlist

        LinkedList<String> stringLinkedList = new LinkedList<>(Arrays.asList(array));
        System.out.println(stringLinkedList);


        // sorting linkedList

        LinkedList<String> numbersList = new LinkedList<>();
        numbersList.add("6");
        numbersList.add("3");
        numbersList.add("8");
        numbersList.add("2");

        System.out.println(numbersList);

        Collections.sort(numbersList);

        System.out.println(numbersList);
    }
}
