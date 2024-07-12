package com.javacore;

class  AgeException extends RuntimeException{
     AgeException() //Default Exception Handler call, then Developer not write mess
     {
         super("You are not Elligible");
     }
     AgeException(String msg)
     {
         super(msg);
     }

}
public class Customized_Exception1 {
    public static void main(String[] args) {
        int age =12;
        try {
            if (age < 18) {
                throw new AgeException("You cannot for voting");
            } else {
                System.out.println("You are Elligible");
            }
        }catch (AgeException e) {
            e.printStackTrace();
        }
    }
}
