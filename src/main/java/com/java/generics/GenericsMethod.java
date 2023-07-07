package com.java.generics;

// example of generic method
public class GenericsMethod {
    public static <K,V>  boolean compare(Pair<K,V> p1, Pair<K,V> p2 ){
        return p1.getKey().equals(p2.getKey()) && p1.getValue().equals(p2.getValue());
    }

}

 class Pair<K,V>
{

    private K key;
    private V value;

  public Pair(K key, V value){
        this.key = key;
        this.value = value;
}

    public void setKey(K k){
        this.key =k;
    }

    public void setValue(V v){
        this.value = v;
    }

    public K getKey(){
        return key;
    }

    public V getValue(){
        return value;
    }

   public static void main(String[] args) {
       Pair<Integer, String> p1 = new Pair<>(1,"Hello");
       Pair<Integer, String> p2 = new Pair<>(2,"Jashan");
       Pair<Integer, String> p3 = new Pair<>(2,"Jashan");
       // boolean result = GenericsMethod.<Integer, String>compare(p1,p2);
       // This feature, known as type inference, allows you to invoke a generic method as an ordinary method, without specifying a type between angle brackets
       boolean result = GenericsMethod.compare(p1,p2);
       boolean result2 = GenericsMethod.compare(p3,p2);

       System.out.println(result);
       System.out.println(result2);

   }


}