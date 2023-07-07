package com.java.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericArrays {

    List<Integer> arrayGeneric = new ArrayList<>();


    // Covariant: It means you can assign subclass type array to its superclass array reference
    Object objectArray[] = new Integer[10];

    // Invariant: It means you cannot assign subclass type generic to its super class generic reference
    // because in generics any two distinct types are neither a subtype nor a supertype.



    // List<Object> objectList = new ArrayList<Integer>();

}
