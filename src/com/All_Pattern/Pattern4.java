package com.All_Pattern;

public class Pattern4 {
    public static void main(String[] args) {

       /* for (char i=65;i<=69;i++)
        {
            for (char j=65;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println("");
        }
        for (char i='A';i<='E';i++)
        {
            for (char j='A';j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println("");
        }*/
        char count=65;
        for (char i='A';i<='E';i++)
        {
            for (char j='A';j<=i;j++)
            {
                System.out.print(count+" ");
                count++;
            }
            System.out.println("");
        }


    }
}

