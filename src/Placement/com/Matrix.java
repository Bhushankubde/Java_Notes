package Placement.com;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        /*
        int a[][]= new int[2][2];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element:");
        for (int i=0;i<a.length;i++)
        {
            for (int j=0;j<a[i].length;j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Array's  Element");
        for (int i=0;i<a.length;i++)
        {
            for (int j=0;j<a[i].length;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println(" ");
        }

        Addition Matrix
        int a[][]= new int[2][2];
        int b[][]= new int[2][2];
        int c[][]= new int[2][2];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st element:");
        for (int i=0;i<a.length;i++)
        {
            for (int j=0;j<a[i].length;j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the 2nd element:");
        for (int i=0;i<a.length;i++)
        {
            for (int j=0;j<a[i].length;j++)
            {
                b[i][j] = sc.nextInt();
            }
        }
        for (int i=0;i<a.length;i++)
        {
            for (int j=0;j<a[i].length;j++)
            {
                c[i][j] =   a[i][j]+  b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println(" ");
        }

        Transpose Matrix
        int a[][]= new int[2][2];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element:");
        for (int i=0;i<a.length;i++)
        {
            for (int j=0;j<a[i].length;j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Array Matrix");
        for (int i=0;i<a.length;i++)
        {
            for (int j=0;j<a[i].length;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println(" ");
        }
        System.out.println("Transpose Matrix");
        for (int i=0;i<a.length;i++)
        {
            for (int j=0;j<a[i].length;j++)
            {
                System.out.print(a[j][i]+" ");
            }
            System.out.println(" ");
        }

        Mirror Matrix
         */
        int a[][]= new int[2][2];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element:");
        for (int i=0;i<a.length;i++)
        {
            for (int j=0;j<a[i].length;j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Array Matrix");
        for (int i=0;i<a.length;i++)
        {
            for (int j=0;j<a[i].length;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println(" ");
        }
        System.out.println("Mirror Matrix");
        for (int i=0;i<a.length;i++)
        {
            for (int j=a[i].length-1;j>=0;j--)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
