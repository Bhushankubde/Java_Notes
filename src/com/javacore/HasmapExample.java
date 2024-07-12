package com.javacore;

import java.util.HashMap;

public class HasmapExample {
    public static void main(String[] args) {
        HashMap<String,Integer> course = new HashMap<>();
        course.put("Java",100);
        course.put("C++",200);
        course.put("Python",400);
        course.put("html",50);
       // System.out.println(course);
        course.forEach((e1,e2)->{
            System.out.println(e1+"->"+e2);
        });
    }
}
