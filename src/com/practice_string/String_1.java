package com.practice_string;

public class String_1 {
    public static void main(String[] args) {
//        String str = "Rock";
//        System.out.println(str.length());
        String str = "Rock is the pubg";
        int count=0;
        for (int i=0;i<str.length();i++)
        {
            if (str.charAt(i)!=' ')
                count++;

        }
        System.out.println(count);
    }
}
