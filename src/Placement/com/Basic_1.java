package Placement.com;

import java.util.Scanner;

public class Basic_1 {
    public static void main(String[] args) {
        /*1.
        for(int i=1;i<=5;i++){
            for (int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
        2.
        System.out.println("Enter the no:");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int fact=1;
        for (int i=1;i<=n;i++){
             fact= fact*i;
        }
        System.out.println(fact);


        3.
        System.out.println("Enter the no:");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int mul=0;
        for (int i=1;i<=10;i++)
        {
            mul = i*n;
            System.out.println(n+"*"+i+"="+mul);
        }

        4.
        System.out.println("Enter the no:");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n,sum=0,first;
        while (n!=0){
            first = n%10;
            sum =(sum*10)+first;
            n=n/10;
        }
        System.out.println(sum);
        if (temp==sum){
            System.out.println("No is Palindrome:"+temp);
        }else {
            System.out.println("No is not Palindrome:"+temp);
        }

         5.
        System.out.println("Enter the no:");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int flag=0;
        for (int i=2;i<=n/2;i++){
            if (n%i==0){
                flag=flag+1;

            }
        }
        if (flag>0){
            System.out.println("Not prime no");
        }else {
            System.out.println("Prime no");
        }

         */
        //fibonacci series
        int a = 0;
        int b = 1;
        int c;
        Scanner sc= new Scanner(System.in);
        int term = sc.nextInt();
        for (int i = 1 ; i<=term;i++)
        {
           System.out.print(a+" ");
            c=a+b;
            a=b;
            b=c;
        }

    }
}
