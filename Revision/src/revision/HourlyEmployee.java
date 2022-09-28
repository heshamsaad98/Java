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
public class HourlyEmployee extends Employee implements Displayble{
    private double hour_rate;
    private double no_of_hours;

    public double getHour_rate() {
        return hour_rate;
    }

    public double getNo_of_hours() {
        return no_of_hours;
    }

    public void setHour_rate(double hour_rate) {
        this.hour_rate = hour_rate;
    }

    public void setNo_of_hours(double no_of_hours) {
        this.no_of_hours = no_of_hours;
    }

    public HourlyEmployee() {
    }

    public HourlyEmployee(double hour_rate, double no_of_hours, String name, String address, int ssn, Gender sex) {
        super(name, address, ssn, sex);
        this.hour_rate = hour_rate;
        this.no_of_hours = no_of_hours;
    }

    @Override
    public double earnings() {
        return no_of_hours * hour_rate;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" + "hour_rate=" + hour_rate + ", no_of_hours=" + no_of_hours + '}';
    }

    @Override
    public void displayaAllDetails() {
        System.out.println(super.toString());
        System.out.println(toString());
    }

    @Override
    public void displayYearnings() {
        System.out.println(earnings());
    }
    
    
}
