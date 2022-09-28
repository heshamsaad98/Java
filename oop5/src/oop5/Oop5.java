/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop5;

/**
 *
 * @author Hesham
 */
public class Oop5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangle room3 = new Rectangle();
        Rectangle myinputobject  = new Rectangle(10, 30);
        room3.modifyobject(myinputobject);
        
        System.out.println(myinputobject.getLength());
        System.out.println(myinputobject.getWidth());
        
        Rectangle r1 = new Rectangle(10, 50);
        Rectangle r2 = new Rectangle(30, 70);
        
        System.out.println(r1.add(r2).getLength());
        System.out.println(r1.add(r2).getWidth());
    }
        
        
    
}
