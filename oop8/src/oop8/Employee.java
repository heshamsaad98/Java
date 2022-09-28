/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop8;

/**
 *
 * @author Hesham
 */
public class Employee extends Person {
    double salary;
    String rank;
    String job;

    public Employee(double salary, String rank, String job, String n, double a, String ad, String net) {
        super(n, a, ad, net);
        this.salary = salary;
        this.rank = rank;
        this.job = job;
    }
    
    public Employee()
    {}

    public double getSalary() {
        return salary;
    }

    public String getRank() {
        return rank;
    }

    public String getJop() {
        return job;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public void setJop(String job) {
        this.job = job;
    }
    
    @Override
    public void printAllDetails()
    {
        super.printAllDetails();
        System.out.println("Job: " + job +"\n Rank: " + rank + "\n Salary: " + salary);
    }
    
}
