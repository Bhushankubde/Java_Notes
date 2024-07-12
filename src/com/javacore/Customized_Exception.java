package com.javacore;

class  UnderAgeException extends Exception{
     UnderAgeException() //Default Exception Handler call, then Developer not write mess
     {
         super("You are not Elligible");
     }
     UnderAgeException(String msg)
     {
         super(msg);
     }

}
public class Customized_Exception {
    public static void main(String[] args)throws UnderAgeException {
        int age =12;
        if (age<18){
            throw new UnderAgeException("You cannot for voting");
        }
        else {
            System.out.println("You are Elligible");
        }
    }
}
