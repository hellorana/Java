package com.java.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class BasicHashMap {

    public static void main(String[] args) {

        // tp add key-value
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1,"Work");
        hashMap.put(2,"Hard");
        hashMap.put(3,"Dont Waste");
        hashMap.put(4,"Time");
        hashMap.put(5,"Always Remember !");

        System.out.println(hashMap);


        // to get value
        String value = hashMap.get(3);
        System.out.println("Value of key is : "+value);

        // to remove
        hashMap.remove(5);
        System.out.println(hashMap);


        // to iterate over keys
        Iterator<Integer> integerIterator = hashMap.keySet().iterator();
        while (integerIterator.hasNext()){
            Integer key = integerIterator.next();
            String valueOfKey = hashMap.get(key);
            System.out.println(" The Key is " + key +" and the value is " + valueOfKey );
        }

        // to iterate over entire set
        Iterator<Map.Entry<Integer, String>> entryIterator = hashMap.entrySet().iterator();
        while (entryIterator.hasNext()){
            Map.Entry<Integer, String> entry =  entryIterator.next();
            System.out.println(" The Key is " + entry.getKey() +" and the Value is " +entry.getValue());
        }
    }

    // how to synchronise hashmap
    
}
