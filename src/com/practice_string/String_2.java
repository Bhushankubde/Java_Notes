package com.practice_string;

public class String_2 {
    public static void main(String[] args) {
        String s ="They are: the period, question mark, exclamation point, comma, colon, semicolon, dash,";
        int count=0;
        for (int i=0;i<s.length();i++){
           if (s.charAt(i)==',' || s.charAt(i)==':'|| s.charAt(i)=='?'|| s.charAt(i)=='/')
               count++;
        }
        System.out.println(count);
    }
}
