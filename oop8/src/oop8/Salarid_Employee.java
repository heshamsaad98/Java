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
public class Salarid_Employee extends Employee{
    double bounus;
    double deduction;

    public Salarid_Employee() {
    }

    public Salarid_Employee(double bounus, double deduction, double salary, String rank, String job, String n, double a, String ad, String net) {
        super(salary, rank, job, n, a, ad, net);
        this.bounus = bounus;
        this.deduction = deduction;
    }

    public double getBounus() {
        return bounus;
    }

    public double getDeduction() {
        return deduction;
    }

    public void setBounus(double bounus) {
        this.bounus = bounus;
    }

    public void setDeduction(double deduction) {
        this.deduction = deduction;
    }
    
    @Override
    public double getSalary()
    {
        return salary + bounus - deduction;
    }
}
