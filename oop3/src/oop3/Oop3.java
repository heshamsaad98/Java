package oop3;

public class Oop3 {

    public static void main(String[] args) {
        Employee e = new Employee(100, "hesham", true);
        e.print_emp_data();
        System.out.println("**************************************************");
        Employee e1 = new Employee(300, "ali", 5000, 300, "Accounting", true);
        e1.print_emp_data();
        System.out.println("setSalary");
        e1.setSalary(7000, 500);
        e1.print_emp_data();
    }
    
}
