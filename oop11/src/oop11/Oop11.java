/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop11;

/**
 *
 * @author Hesham
 */
public class Oop11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Course c1 = Course.Database;
        Course c2 = Course.Math;
        
        System.out.println(c1.toString()); 
        System.out.println(c1.ordinal()); 
        
        System.out.println(c1.compareTo(c2)); 
        
        System.out.println(c1.equals(c2)); 
    }
    
}
