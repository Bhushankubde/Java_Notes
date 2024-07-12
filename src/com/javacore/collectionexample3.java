package com.javacore;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class collectionexample3 {
    public static void main(String[] args) {
        TreeMap<Integer,String> t1 = new TreeMap<>();
        t1.put(1,"Mango");
        t1.put(2,"Orange");
        t1.put(3,"Banana");
        t1.put(4,"Grapes");
        t1.put(5,"Apple");
//        for (Map.Entry<Integer,String>entry:t1.entrySet()) {
//            System.out.println(entry.getKey()+"=>"+entry.getValue());
//        }
        System.out.println(t1);
        TreeMap<Integer,String> t2 = new TreeMap<>();
        t2.put(6,"Orange");
        t2.put(7,"Green");
        System.out.println(t2);
        t1.putAll(t2);
        System.out.println(t1);
        //System.out.println(t1.get(5));
//      if (t1.containsKey(9)){
//          System.out.println("This key is present");
//      }else {
//          System.out.println("This key is not present");
//      }
//
//        if (t1.containsValue("Orange")){
//            System.out.println("This key is present");
//        }else {
//            System.out.println("This key is not present");
//        }
        System.out.println(t1.floorKey(3));
    }
}

