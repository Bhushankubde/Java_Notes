package com.javacore;

public class Threadsdemo extends Thread {
    @Override
    public void run() {
        System.out.println("User defined Thread");
    }

    public static void main(String[] args) {
        System.out.println("Program started.....");
        Thread t = Thread.currentThread();
        String tname= t.getName();
        System.out.println(tname);
        System.out.println("Main:"+t.getId());

        Threadsdemo sc = new Threadsdemo();
        sc.start();
        System.out.println("Userdefined:"+sc.getId());
        String name= sc.getName();
        System.out.println(name);

        System.out.println("Program ended.....");
    }
}
