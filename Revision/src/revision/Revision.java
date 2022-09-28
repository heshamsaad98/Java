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
public class Revision {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Department d = new Department(1, "Information Systems");
        
        SalariedEmployee se = new SalariedEmployee(2000, 500, 50, "Ahmed", "Egypt", 1200, Gender.male);
        d.add_employee(se);
        
        HourlyEmployee he = new HourlyEmployee(100, 6, "Mohamed", "Egypt", 1200, Gender.male);
        d.add_employee(he);
        
        CommissionEmployee ce = new CommissionEmployee(15000, 0.25, "Ali", "Egypt", 1200, Gender.male);
        d.add_employee(ce);
        
//        System.out.println(d.getEmployeeCount());
//        
//        System.out.println("************************************");
//        
//        d.print_basic_data();
        
//        System.out.println("************************************");
        d.print_all_details();
    }
    
}
