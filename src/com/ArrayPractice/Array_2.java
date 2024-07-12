package com.ArrayPractice;

public class Array_2 {
    public static void main(String[] args) {
      /*  int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Original Matrix");
        for (int i=0;i<a.length;i++)
        {
            for (int j=0;j<a[i].length;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("Transpose Matrix");
        for (int i=0;i<a.length;i++)
        {
            for (int j=0;j<a[i].length;j++)
            {
                System.out.print(a[j][i]+" ");
            }
            System.out.println("");
        }
        int count=0,non_count=0;
        int a[][] = {{1,0,0},{0,5,0},{0,0,9}};
        System.out.println("Original Matrix");
        for (int i=0;i<3;i++)
        {
            for (int j=0;j<3;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println("");
        }
        for (int i=0;i<3;i++)
        {
            for (int j=0;j<3;j++)
            {
              if (a[i][j]==0)
              {
                  count++;
              }else {
                  non_count++;
              }
            }

        }
        if (count>non_count){
            System.out.println("This is Sparse matrix");
        }else {
            System.out.println("This is not Sparse matrix");
        }

        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        int b[][]={{11,12,13},{14,15,16},{17,18,19}};
        int c[][] = new  int[3][3];
        System.out.println("1st Matrix");
        for (int i=0;i<3;i++)
        {
            for (int j=0;j<3;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("2nd Matrix");
        for (int i=0;i<3;i++)
        {
            for (int j=0;j<3;j++)
            {
                System.out.print(b[i][j]+" ");
            }
            System.out.println("");
        }
        for (int i=0;i<3;i++)
        {
            for (int j=0;j<3;j++)
            {
                c[i][j] = 0;
                for (int k = 0; k < 3; k++)
                {
                    c[i][j] = c[i][j] + a[i][k] * b[k][j];
                }
            }
        }
        System.out.println("Multiply Matrix");
        for (int i=0;i<3;i++)
        {
            for (int j=0;j<3;j++)
            {
                System.out.print(c[i][j]+" ");
            }
            System.out.println("");
        }*/

        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println(" ");
        }
        for (int i=0;i<3;i++){
            int sum=0;
            int add=0;
            for (int j=0;j<3;j++){
                sum = sum+a[i][j];
                add = add+a[j][i];
            }
            System.out.println("Sum of "+(i+1)+"row is: "+sum);
            System.out.println("Add of "+(i+1)+"column is: "+add);
        }
    }
}
