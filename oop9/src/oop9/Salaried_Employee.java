/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop9;

/**
 *
 * @author Hesham
 */
public class Salaried_Employee extends Employee{
    double bounus;
    double deduction;

    public Salaried_Employee() {
    }

    public Salaried_Employee(double bounus, double deduction, String n, double a, double sal, String r, String j) {
        super(n, a, sal, r, j);
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
