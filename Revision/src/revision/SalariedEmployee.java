/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revision;

/**
 *
 * @author Hesham
 */
public class SalariedEmployee extends Employee implements Displayble {
    double salary, bonus, deductions;

    public double getSalary() {
        return salary;
    }

    public double getBonus() {
        return bonus;
    }

    public double getDeductions() {
        return deductions;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void setDeductions(double deductions) {
        this.deductions = deductions;
    }

    public SalariedEmployee() {
    }

    public SalariedEmployee(double salary, double bonus, double deductions, String name, String address, int ssn, Gender sex) {
        super(name, address, ssn, sex);
        this.salary = salary;
        this.bonus = bonus;
        this.deductions = deductions;
    }
    
    @Override
    public double earnings()
    {
        return (salary + bonus) - deductions;
    }
    
    @Override
    public void displayaAllDetails()
    {
        System.out.println(super.toString());
        System.out.println(toString());
    }
    
    @Override
    public void displayYearnings()
    {
        System.out.println(earnings());
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" + "salary=" + salary + ", bonus=" + bonus + ", deductions=" + deductions + '}';
    }
    
    
}
