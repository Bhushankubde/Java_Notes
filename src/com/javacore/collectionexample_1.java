package com.javacore;

import java.util.*;

public class collectionexample_1 {
    public static void main(String[] args) {
        ArrayList<String> objects = new ArrayList<>();
        objects.add("Blue");
        objects.add("Green");
        objects.add("Orange");
        objects.add("Purple");
       /*
        System.out.println(objects);
        objects.add(0,"Pink");
        System.out.println(objects);
        objects.remove(4);
        System.out.println(objects);

        Collections.sort(objects);
        System.out.println(objects);

/        List<String> li = new ArrayList<>();
         li.addAll(objects);
        System.out.println(li);
        Collections.shuffle(objects);
   System.out.println(objects);
        Collections.reverse(objects);
        System.out.println(objects);

        List<String> li1 = objects.subList(0,3);
        System.out.println(li1);



        System.out.println("Before swaping");
        for (String c :objects ){
            System.out.println(c);
        }
        Collections.swap(objects,0,2);
        System.out.println("After swaping");
        for (String b :objects ){
            System.out.println(b);
        }

        System.out.println(objects);
        ArrayList<String> newlist = (ArrayList<String>)objects.clone();
        System.out.println(newlist);

        */
        System.out.println(objects);
        objects.removeAll(objects);
        System.out.println(objects);
    }
}
