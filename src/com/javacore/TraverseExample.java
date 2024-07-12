package com.javacore;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

public class TraverseExample {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList();
        name.add("Kartik");
        name.add("Purvesh");
        name.add("Rock");
        name.add("Bhushan");
        //System.out.println(name);

        //for each loop
        for (String item:name) {
            System.out.print(item+"\t");
            StringBuffer str = new StringBuffer(item);
            System.out.println(str.reverse()+"\t");
        }
        System.out.println("------------Iterator Forwarding------------------------------------");

        //Iterator Forwarding Traversing
        Iterator<String> itr = name.iterator();
        while (itr.hasNext()){
            String nm = itr.next();
            System.out.println(nm);
        }
        System.out.println("-------------Iterator Forwarding and Backword-----------------------------");

        //Iterator Forwarding and Backword Traversing
        ListIterator<String> itr1 = name.listIterator(name.size());
        while (itr1.hasPrevious()){
            String previous = itr1.previous();
            System.out.println(previous);
        }

//        System.out.println("------------------------------------------");
//        name.forEach(e->{
//            System.out.println(e);
//        });

        System.out.println("----------TREE SET--------------------------");
        TreeSet<String> tree = new TreeSet();
        tree.addAll(name);
        tree.forEach(p->{
            System.out.println(p);
        });


    }
}
