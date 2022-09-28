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
public class BasePlusCommissionEmployee extends CommissionEmployee {
    
    private double base;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
    
    @Override
    public double earnings()
    {
        return base + super.earnings();
    }
    
    @Override
    public void displayaAllDetails()
    {
        super.displayaAllDetails();
        displayYearnings();
        
    }
    
    @Override
    public void displayYearnings()
    {
        System.out.println("Earnings = " + earnings());
    }
}
