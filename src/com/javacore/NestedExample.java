package com.javacore;
                              //Static Inner Class
public class NestedExample {
    static int a= 10;
    int b=20;
    static void  display(){
        System.out.println(a);
    }
    static class Inner{
        Inner(){
            System.out.println("this is Constructor of Inner class");
            System.out.println(a);
           // System.out.println(b);  Not access
        }

    }

    public static void main(String[] args) {
        System.out.println(NestedExample.a);
        NestedExample.display();
        NestedExample.Inner obj = new NestedExample.Inner();

    }
}
