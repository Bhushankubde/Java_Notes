package Placement.com;

public class THis {
    int a;
    public THis(int a) {
            this. a= a;
    }
    void  show(){
        System.out.println(this.a);
    }

    public static void main(String[] args) {
        THis sc = new THis(10);
        sc.show();
    }
}
