package Placement.com;

import java.util.Arrays;
import java.util.Scanner;

public class Array_1{
    public static void main(String[] args) {
        //  int a[]= {1,2,3,4,5};
       /* for (int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
        for (int i=a.length-1;i>=0;i--){
            System.out.println(a[i]);
        }

        for (int i=0;i<a.length;i++)
        {
            if (a[i]%2==0){
                System.out.println("even:"+a[i]);
        }else {
                System.out.println("odd:"+a[i]);
            }

        }

        for (int i=1;i<a.length;i=i+2){
            System.out.println(a[i]);
        }

        1.Method
        int a[] = {2,5,7,8,9,3,1};
        Arrays.sort(a);
        for (int i=0;i< a.length;i++) {
            System.out.println(a[i]);
        }

        int a[] = {2,5,7,8,9,3,1};
        int temp=0;
        for (int i=0;i<a.length-1;i++)
        {
            for (int j=i+1;j<a.length;j++)
            {
                if (a[i]<a[j]){
                     temp=a[i];
                     a[i]=a[j];
                     a[j]=temp;
                }
            }
            for ( i=0;i<a.length;i++){
                System.out.println(a[i]);
            }
        }

        System.out.println("Enter the size");
        Scanner cs = new Scanner(System.in);
        int size = cs.nextInt();
        int a[]=new int[size];
        System.out.println("Enter the elements");
        for (int i=0 ; i<size;i++)
        {
            a[i] = cs.nextInt();
        }
        for (int i=0 ; i<size;i++)
        {
            System.out.println(a[i]);
        }

        int a[]={1,2,3,4,5};
        //String a[] = {"jalebi","samosa","kachori","pani-puri"};
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.asList(a));
        int aa[][]={{10,20,30},{40,50,60}};
        System.out.println(Arrays.deepToString(aa));

        int a[]={1,2,3,4,5};
        for (int i=a.length-1;i>=0;i--){
            System.out.println(a[i]);
        }

        int sum=0;
        int a[]={1,2,3,4,5};
        for (int i=0;i< a.length;i++){
            sum +=a[i];
        }
        System.out.println(sum);

        int flag=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element:");
        int c=sc.nextInt();
        int a[]={1,2,2,4,4,4,5};
        for (int i=0;i< a.length;i++) {
            if (c == a[i]) {
                flag=flag+1;
            }
        }
        if (flag>0){
            System.out.println("Element is present :"+flag);
        } else {
            System.out.println("Element is not present :"+flag);
        }

        int i,temp=0;
        int a[]={2,3,4,6,8,9,1,5};
        for ( i=0;i<a.length;i++){
            for (int j=i+1;j<a.length;j++){
                if (a[i]<a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for (i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }

        int a[]= new int[5];
        System.out.println("Enter the element:");
        Scanner sc = new Scanner(System.in);
        for (int i=0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }

        int a[]= new int[5];
        System.out.println("Enter the element:");
        Scanner sc = new Scanner(System.in);
        for (int i=0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        int a1[] = Arrays.copyOf(a,8);
        for (int i=0;i<a.length;i++){
            System.out.print(a1[i]+" ");
        }

        int i, max = 0;
        int a[] = {2, 3, 4, 6, 8, 9, 1, 5};
        for (i = 0; i < a.length; i++) {
            max = a[0];
            for (i = 1; i < a.length; i++) {
                if (a[i]>max) {
                    max=a[i];
                }
            }
        }
        System.out.println(max);

        int i, min = 0;
        int a[] = {2, 3, 4, 6, 8, 9, 1, 5};
        for (i=0;i<a.length;i++){
            min=a[0];
            for (i=1;i<a.length;i++){
                if (a[i]<min){
                    min=a[i];
                }
            }
        }
        System.out.println(min);

        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int sz= sc.nextInt();
        int a[]= new int[sz+1];
        System.out.println("Enter the element:");
        for ( i=0;i<sz;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the loc:");
        int loc= sc.nextInt();
        System.out.println("Enter the new item:");
        int item= sc.nextInt();
        for (i=sz;i>loc;i--){
            a[i] = a[i-1];
        }
       a[loc]=item;
        sz++;
        System.out.println("Array's element:");
        for ( i=0;i<sz;i++){
            System.out.println(a[i]);
        }

        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int sz= sc.nextInt();
        int a[]= new int[sz+1];
        System.out.println("Enter the element:");
        for ( i=0;i<sz;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the loc:");
        int loc= sc.nextInt();
        for (i=loc;i<sz-1;i++){
            a[i]= a[i+1];
        }
        sz--;
        System.out.println("Array's element:");
        for ( i=0;i<sz;i++){
            System.out.println(a[i]);
        }

        */
    }

}
