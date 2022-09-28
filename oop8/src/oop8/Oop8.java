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
public class Oop8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Salarid_Employee se1 = new Salarid_Employee(3000, 100, 500, "Manager", "Engineer", "Ahmed", 30, "Egypt", "Egyption");
//        System.out.println(se1.getSalary());
        
        Employee e = new Employee(3000, "Manager", "Engineer", "Ahmed", 30, "Egypt", "Egyption");
        e.printAllDetails();
    }
    
}
