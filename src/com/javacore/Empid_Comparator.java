package com.javacore;

import java.util.Comparator;

public class Empid_Comparator implements Comparator<Comparartor_Comparable> {
    @Override
    public int compare(Comparartor_Comparable o1, Comparartor_Comparable o2) {
        return o1.getEmpid()-o2.getEmpid();
    }
}
