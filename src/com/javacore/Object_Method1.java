package com.javacore;

public class Object_Method1 implements Cloneable{
    private String empl_name;
    private int emp_id;

    public Object_Method1() {
    }

    public Object_Method1(String empl_name, int emp_id) {
        this.empl_name = empl_name;
        this.emp_id = emp_id;
    }

    public String getEmpl_name() {
        return empl_name;
    }

    public void setEmpl_name(String empl_name) {
        this.empl_name = empl_name;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Object_Method1 obj = new Object_Method1("java",1);
        Object_Method1 obj1 = (Object_Method1)obj.clone();

        obj.setEmp_id(2);
        obj.setEmpl_name("C++");

        System.out.println("Emp_id :"+obj.getEmp_id()+" Emp_name :"+obj.getEmpl_name());
        System.out.println("Emp_id :"+obj1.getEmp_id()+" Emp_name :"+obj1.getEmpl_name());
    }
}
