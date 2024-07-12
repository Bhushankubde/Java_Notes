package com.javacore;

public class Object_Methods {
    private String empl_name;
    private int emp_id;

    public Object_Methods()
    {

    }
    public Object_Methods(String empl_name, int emp_id) {
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

    @Override
    public String toString() {
        return "Employee name :"+empl_name+" ,Employee id:"+emp_id;
    }

    @Override
    public int hashCode() {
        return emp_id;
    }

    @Override
    public boolean equals(Object obj){
      Object_Methods that = (Object_Methods) obj;
      return (this.emp_id==that.emp_id && this.empl_name.equals(that.empl_name));
    }

    public static void main(String[] args) {
        Object_Methods sc = new Object_Methods("Java",121);
        Object_Methods sc1 = new Object_Methods("C++",122);
        Object_Methods sc2 = new Object_Methods("Java",121);
        Object_Methods sc3 = sc;
//        System.out.println(sc.toString());
//        System.out.println(sc.hashCode());
        System.out.println(sc.equals(sc2));
    }
}
