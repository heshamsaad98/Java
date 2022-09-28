package oop3;

public class Employee {
    int emp_id;
    String ename;
    String depart;
    double salary;
    double bonus;
    boolean resident;
    
    public Employee()
    {
        emp_id = 100;
        ename = "No Name";
        salary = 3000;
        bonus = 500;
        depart = "No Assigned Yet";
        resident = true;
    }
    
    public Employee(int idno, String n)
    {
        emp_id = idno;
        ename = n;
    }
    
    public Employee(int idno, String n, boolean r)
    {
        this (idno, n);
        resident = r;
    }
    
    public Employee(int idno, String n, double s, double b, String d,  boolean r)
    {
        this (idno, n, r);
        salary = s;
        bonus = b;
        depart = d;
    }
    
    public void setSalary(double s)
    {
        salary = s;
    }
    
    public void setSalary(double s, double b)
    {
        this.setSalary(s);
        bonus = b;
    }
    
    public void print_emp_data()
    {
        System.out.println("ID: " + emp_id);
        System.out.println("Name: " + ename);
        System.out.println("Depart: " + depart);
        System.out.println("Salary: " + salary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Resident: " + resident);
    }
    
}
