/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package for5;

/**
 *
 * @author Hesham
 */
public class For5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(int i = 8; i >= 0; i--)
        {
            for(int x = 0; x <= i; x++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
