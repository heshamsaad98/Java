package array6;

import java.util.Scanner;

public class Array6 {

    public static void main(String[] args) {
        int v[][] = new int[5][2];
        in_array(v);
        out_array(v);
    }
    
    static void in_array(int arr[][])
    {
        Scanner ss = new Scanner(System.in);
        System.out.println("enter number");
        for (int[] arr1 : arr) {
            for (int k = 0; k < arr1.length; k++) {
                arr1[k] = ss.nextInt();
            }
        }
    }
    
    static void out_array(int arr[][])
    {
        for (int[] arr1 : arr) {
            for (int k = 0; k < arr1.length; k++) {
                System.out.print(arr1[k] + "\t");
            }
            System.out.println();
        }
    }
    
}
