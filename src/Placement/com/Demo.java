package Placement.com;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
      /*
      1.
      int a=5,b=10,c=3,Max;
        Max=(a>b)?(a>c ? a:c) : (b>c ? b:c);
        System.out.println(Max);*/

       /*
       2.
       System.out.println("Enter the no:");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        for (int i=1;i<=n;i++){
            System.out.print(i+"  ");
        }


        System.out.println("Enter the no:");
        Scanner sc = new Scanner(System.in);
        int sum=0;
        int n= sc.nextInt();
        for (int i=1;i<=n;i++){
            sum = sum+i;
        }
        System.out.println(sum);


        System.out.println("Enter the character:");
        Scanner sc = new Scanner(System.in);
        char ch;
        ch = sc.next().charAt(0);
        System.out.println(ch);


        System.out.println("Enter the character:");
        Scanner sc = new Scanner(System.in);
        char ch;
        ch = sc.next().charAt(0);
        if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            System.out.println("Vowel");
        }else {
            System.out.println("Consonant");
        }

        System.out.println("Enter the character:");
        Scanner sc = new Scanner(System.in);
        char ch;
        ch = sc.next().charAt(0);
        int a =ch;
        System.out.println("ASCII Value:"+a);

        for (char ch= 65;ch<=90;ch++)
        {
            System.out.print(ch+" ");
        }
        System.out.println("");
        for (char ch= 97;ch<=122;ch++)
        {
            System.out.print(ch+" ");
        }

        int a=10,b=20,c=30;
        int result = (a>b)?(a>c?a:c):(b>c?b:c);
        System.out.println(result);

        final double pi=3.14,area;
        int r;
        System.out.println("Enter the radius");
        Scanner sc = new Scanner(System.in);
        r= sc.nextInt();
        area = pi*r*r;
        System.out.println(area);


        int y;
        System.out.println("Enter the Year");
        Scanner sc = new Scanner(System.in);
        y= sc.nextInt();
        if (y%100==0 && y%400==0 || y%100!=0 && y%4==0)
        {
            System.out.println("Leap Year");
        }
        else
        {
            System.out.println("Not Leap Year");
        }

        int n,sum=0,f=0;
        System.out.println("Enter the no");
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        while (n!=0){
            f=n%10;
            sum = sum+f;
            n=n/10;
        }
        System.out.println(sum);


        int n,rem,arm=0,temp;
        System.out.println("Enter the no");
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        temp=n;
        while (n>0){
            rem = n%10;
            arm = (rem*rem*rem)+arm;
            n=n/10;
        }
        if(arm==temp){
            System.out.println("Armstrong Number");
        }else {
            System.out.println("Not Armstrong Number");
        }

        Perfect No
        int n,sum=0;
        System.out.println("Enter the no");
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        for (int i=1;i<n;i++){
            if (n%i==0){
                sum=sum+i;
            }
        }
        if (n==sum){
            System.out.println("Perfect no");
        }else {
            System.out.println("Not Perfect no");
        }
        */
        int n1,n2,i,j;
        System.out.println("Enter the n1");
        Scanner sc = new Scanner(System.in);
        n1= sc.nextInt();
        n2= sc.nextInt();
        for (i=n1;i<=n2;i++) {
            for (j=2;j<=i;j++){
                if (i%j==0)
                    break;
            }
            if (i==j){
                System.out.print(j+" ");
            }
        }
    }
}
