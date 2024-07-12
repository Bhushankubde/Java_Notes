package Placement.com;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        /*
//      Types of Array Creation:-
        int arr1[] = new int[5];
        int []arr2 = new int[6];
        int arr3[] = {10,20,30,40,50};
        int arr4[] = new int[]{1,2,3,4,5,6,7};
          arr4 = arr3;
          for (int i =0;i< arr4.length;i++){
              System.out.println(arr4[i]);
          }
        for (int a:arr4) {
            System.out.println(a);
        }


        1.
        int a[]={1,2,3,4,5};
        int b[]=new int[a.length];
         for (int i=0;i< b.length;i++){
             b[i]=a[i];
             System.out.println(b[i]);
         }


        2.
        int a[] = {1, 2, 4, 4, 2, 2, 2, 1, 6, 6, 4, 8, 9, 1};
        for (int i = 0; i <= a.length; i++) {
            int count = 0;
            int x = a[i];
            if (x==-1)
                continue;
            for (int j = 0; j < a.length; j++) {
                if (a[j] == x) {
                    count++;
                    a[j] = -1;
                }
            }
            System.out.println("Frequncy of "+x+" : "+count);
        }
          3.
     */
                int a[] = {1,2,3,4,5};
                System.out.println("Simple Array");
                for (int i=0;i<a.length;i++){
                    System.out.print(a[i]+" ");
                }
                int first = a[0];
                for (int j=0;j<a.length-1;j++){
                    a[j]=a[j+1];
                }
                a[a.length-1]= first;
                System.out.println("\n Rotate Array");
                for (int i=0;i<a.length;i++){
                  System.out.print(a[i]+" ");
            }
        }
    }

