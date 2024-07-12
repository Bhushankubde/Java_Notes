package com.javacore;
                           //Member Inner Class
public class NestedExample1 {
    class Member{
        int a=10;
        private int b=5;
        static  int c=25;
      public  void add(){
          System.out.println("Addition of number:"+(a+b+c));
      }
    }

    public static void main(String[] args) {
        // NestedExample1 obj1 = new NestedExample1();
        // NestedExample1.Member sc = obj1.new Member();
        NestedExample1.Member obj = new NestedExample1().new Member();
       obj.add();

    }

   }