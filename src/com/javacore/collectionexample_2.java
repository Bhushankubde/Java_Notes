package com.javacore;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class collectionexample_2 {
    public static void main(String[] args) {
        LinkedList<String> li = new LinkedList<>();
        li.add("Blue");
        li.add("Green");
        li.add("Orange");
        li.add("Purple");
        System.out.println(li);

        Iterator<String> iterator = li.descendingIterator();
        while (iterator.hasNext()){
           String name =  iterator.next();
            System.out.println(name);
        }
    }
}
