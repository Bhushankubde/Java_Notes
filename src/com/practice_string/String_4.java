package com.practice_string;

public class String_4 {
    public static void main(String[] args) {
        String st= "banana";
        int count=0;
        for (int i=0;i<st.length();i++){
            if (st.charAt(i)=='a')
               count++;
        }
        System.out.println(count);
    }
 }
