/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package for9;

/**
 *
 * @author Hesham
 */
public class For9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++)
        {
            for(int x = 0; x < 5; x++)
            {
                if(i == 0 || i == (5 - 1))
                {
                    System.out.print("*");
                }
                else if(x == 0 || x == (5 - 1))
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
