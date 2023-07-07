package com.java.exceptionhandling;

public class CustomExceptionExample {

    void productCheck(int num) throws InvalidProductException {
        if (num < 100)
            throw new InvalidProductException("Message : Invalid Product");
    }


    public static void main(String[] args) {

        CustomExceptionExample obj = new CustomExceptionExample();
        try
        {
            obj.productCheck(20);
        }
        catch (InvalidProductException e) {
           // e.printStackTrace();
            System.out.println("Exception handled");
            System.out.println(e.getMessage());
        }
    }
}