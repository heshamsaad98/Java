/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop9;

public abstract class Employee{
    String name;
    double age;
    double salary;
    String rank;
    String job;

    public Employee(String n, double a, double sal, String r, String j) {
        
        name = n;
        age = a;
        salary = sal;
        rank = r;
        job = j;
    }
    
    public Employee()
    {}
    
    public abstract double getSalary();

    public void setSalary(double salary) {
        this.salary = salary;
    }

    
}
