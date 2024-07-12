package com.javacore;

import java.util.ArrayList;
import java.util.Collections;

public class Comparator_Comparable_main {
    public static void main(String[] args) {
        ArrayList<Comparartor_Comparable> li = new ArrayList<>();
        li.add(new Comparartor_Comparable("Sandeep",151,21));
        li.add(new Comparartor_Comparable("Rohit",102,23));
        li.add(new Comparartor_Comparable("Purvesh",121,25));
        Collections.sort(li,new Empid_Comparator());
        System.out.println(li);

        ArrayList<Comparartor_Comparable> li1 = new ArrayList<>(li);
        Collections.sort(li1,new Name_Comparator());
        System.out.println(li1);

        ArrayList<Comparartor_Comparable> li2 = new ArrayList<>(li);
        Collections.sort(li2,new Age_Comparator());
        System.out.println(li2);

    }
}
