/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array2;

/**
 *
 * @author Hesham
 */
public class Array2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int v[] = {10, 50, 2, 60, 9};
        int max = v[0];
        for(int i = 0; i < v.length; i++)
        {
            if(max < v[i])
                max = v[i];
        }
        System.out.println(max);
    }
    
}
