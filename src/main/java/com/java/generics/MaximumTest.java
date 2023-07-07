package com.java.generics;

public class MaximumTest {
    // determine the largest of three elements

    // this example states that, when we want to restrict the kind of types allowed to passed to a type parameter, we can use
    // extends keyword i.e called as bounded type parameters
    public static <T extends Comparable<T>> T maximum(T x, T y, T z)
    {
        T max = x;

        if(y.compareTo(max) >0){
            max = y;
        }

        if(z.compareTo(max) >0){
            max = z;
        }
     return max;

    }

    public static void main(String[] args) {

        System.out.printf("Maximum of %d, %d and %d is %d %n%n ",3,4,5, maximum(1,2,3));

        System.out.printf("Maximum of %.1f, %.1f and %.1f is %.1f %n ",1.1,1.8,3.2, maximum(1.1,1.8,3.2));

    }
}
