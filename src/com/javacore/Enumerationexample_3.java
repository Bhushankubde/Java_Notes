package com.javacore;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Enumerationexample_3 {
    public static void main(String[] args) {

        Vector<String> vc = new Vector<>();
        vc.add("Blue");
        vc.add("Purple");
        vc.add("Green");
        vc.add("Orange");
        vc.add("Brown");
        Enumeration<String> elements = vc.elements();
        while (elements.hasMoreElements()){
            System.out.println(elements.nextElement());
        }

    }
}
