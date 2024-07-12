package com.javacore;

public class Comparartor_Comparable {
    private String name;
    private int empid;
    private int age;


    public Comparartor_Comparable(){

    }
    public Comparartor_Comparable(String name, int empid, int age) {
        this.name = name;
        this.empid = empid;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Comparartor_Comparable{" +
                "name='" + name + '\'' +
                ", empid=" + empid +
                ", age=" + age +
                '}';
    }
}
