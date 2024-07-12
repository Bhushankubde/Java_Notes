package Placement.com;

import java.util.Scanner;

public class Recursive {
    public static void main(String[] args) {
        Recursive r = new Recursive();
       /* int st = r.sum(3);
        System.out.println(st);*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no:");
        int n = sc.nextInt();

        int store = r.fact(n);
        System.out.println(store);
    }

    /* int sum(int b ){
         if (b>0)
         {
              return b+sum(b-1);
         }
         else
         {
         return  0;
         }
     }

     */
    int fact(int n) {
        if (n == 1) {
            return n;

        } else {
            return n * fact(n - 1);
        }
    }
}
