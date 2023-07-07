package com.java.basics;

import java.util.HashMap;

// an example of custom key design for hashcode and equals
public class HashcodeExample {

    private int accountNumber;
    private String accountHolderName;

    public HashcodeExample(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }


    @Override
    public int hashCode() {
        int prime = 31;
        int result =1;
        result = result * prime + accountNumber;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(obj == null)
            return false;
        if(getClass() != obj.getClass())
            return false;
        HashcodeExample otherobj = (HashcodeExample) obj;
        if(accountNumber != otherobj.accountNumber)
            return false;
        return true;
    }

    //testing hashmap overridden methods
    public static void main(String[] args) {
        HashMap<HashcodeExample, String> map = new HashMap<>();

        // to create key object
        HashcodeExample key1 = new HashcodeExample(1);
        key1.setAccountHolderName("First Account Number");

        HashcodeExample key2 = new HashcodeExample(2);
        key2.setAccountHolderName("Second Account Number");

        map.put(key1,key1.getAccountHolderName());
        map.put(key2,key2.getAccountHolderName());

        // changes the value to test the hashcode value
        key1.setAccountHolderName("First Account Number Change");
        key2.setAccountHolderName("Second Account Number Change");

        System.out.println(map.get(key1));
        System.out.println(map.get(key2));

        // changes made to key with newly created account number
        HashcodeExample key3 = new HashcodeExample(1);
        key3.setAccountHolderName("Third Account Number");

        System.out.println(map.get(key3));


        // Conclusion is we are still able to get back the original value despite changing key and values, reason being overridden equals and
        // hashcode also using immutable class which is string.
        // Also hashcode is unique which depends on account number.
    }


}
