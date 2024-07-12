package com.javacore;

public class UserdefinedException extends RuntimeException {
     UserdefinedException(String msg)
     {
         super(msg);
     }
    public static void main(String[] args) {
        int a=29;
        try {
            if (a < 18) {
                throw new UserdefinedException("You are not Eligible for voting");
            } else {
                System.out.println("Voting Success!....");
            }
        }catch (UserdefinedException e)
        {
            e.printStackTrace();
        }
        System.out.println("Normal Termination");
     }
 }

