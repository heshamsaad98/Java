/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author Hesham
 */
public class Exceptions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try
        {
            int x, y;
            Scanner s = new Scanner(System.in);
            
            System.out.println("Enter x: ");
            x = s.nextInt();
            
            System.out.println("Enter y: ");
            y = s.nextInt();
            
            System.out.println("x / y = " + x/y);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Error, Division by Zero not Allowed");
        }
        catch(InputMismatchException e)
        {
            System.out.println("Error, Place Enter Numirc values");
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println("The Program Continues");
    }
    
}
