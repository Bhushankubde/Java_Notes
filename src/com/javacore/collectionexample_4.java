package com.javacore;


import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

class sort implements Comparator<Integer> {


    @Override
    public int compare(Integer o1, Integer o2) {
        return o1-o2;
    }
}
public class collectionexample_4 {
    public static void main(String[] args) {
        TreeMap<Integer,String> t1 = new TreeMap<>();
        t1.put(3,"green");
        t1.put(1,"blue");
        t1.put(5,"orange");
        t1.put(4,"yellow");
        t1.put(2,"purple");
        System.out.println(t1);
    }
}
