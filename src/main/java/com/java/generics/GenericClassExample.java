package com.java.generics;

// Example of generic method and generic class
public class GenericClassExample<T> {

    private T t;

    public GenericClassExample(T t) {
        this.t = t;
    }

    public void setT(T t){
        this.t = t;
    }

    public T getT()
    {
        return t;
    }

    // Generic Method

    public static <T> void genericMethod(T element){
        System.out.println(element.getClass().getName() + ":" + element);
    }

    public static void main(String[] args) {

        GenericClassExample<Integer> obj1 = new GenericClassExample<Integer>(15);
        System.out.println(" Integer type generic is : "+ obj1.getT() );

        GenericClassExample<String>  obj2 = new GenericClassExample<String>("Hello Jashan! Keep working Hard");
        System.out.println(" String type generic is : "+ obj2.getT());


        genericMethod(12);
        genericMethod("Calling Generic method with string type");

      }


}
