/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop6;

/**
 *
 * @author Hesham
 */
public class Oop6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rectangle r1 = new Rectangle(10,50);
        Rectangle r2 = new Rectangle(r1);
        
        System.out.println(r2.getLength());
        System.out.println(r2.getWidth());
        
//        Rectangle r2 = new Rectangle(10,50);
        
//        if(r1.isEqual(r2))
//            System.out.println("The objects are equal");
//        else
//            System.out.println("The objects are different");

//        r2 = r1;
//        
//        r2.setLength(90);
//        System.out.println(r1.getLength());
//        
//        if(r1 == r2)
//            System.out.println("The objects are equal");
//        else
//            System.out.println("The objects are different");
    }
    
}
