package com.version1.SpringDatabase;

public class Employee {
    private int employee_id;
    private String first_name;
    private String last_name;
    private int age;

    public void setDept(int dept) {
        this.dept = dept;
    }

    public int getDept() {
        return dept;
    }

    private int dept;

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employee_id=" + employee_id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", age=" + age +
                ", dept=" + dept +
                '}';
    }
}
