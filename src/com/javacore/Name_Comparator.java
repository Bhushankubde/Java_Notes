package com.javacore;

import java.util.Comparator;

public class Name_Comparator implements Comparator<Comparartor_Comparable> {

    @Override
    public int compare(Comparartor_Comparable o1, Comparartor_Comparable o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
