package com.java.statements;

public class SwitchBasic {

    public static void main(String[] args) {

        char value = 'C';

        switch (value)
        {

            case 'B' :
                System.out.println("Value is B");
                break;
            case 'A' :
                System.out.println("Value is A");
                break;
            default:
                System.out.println("No value is matched");
                break;
        }
    }
}
