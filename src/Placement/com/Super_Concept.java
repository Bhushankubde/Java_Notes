package Placement.com;
class A{
    public A() {
        System.out.println("A constructor called");
    }


    /*//int a=20;
    void disp(){
        System.out.println("Hii");
                             //  System.out.println(super.a); variable called from super
    }*/
}
public class Super_Concept extends A {
    public Super_Concept() {
        //super();               //By default super class contructor called
        System.out.println("Super_Concept constructor called");
    }

    /*// int a=40;

        void disp(){
            super.disp();         // Method called from super
            System.out.println("Hello");
                                  //  System.out.println(super.a); variable called from super
        }*/
    public static void main(String[] args) {
       Super_Concept sc =new Super_Concept();
    }
}
