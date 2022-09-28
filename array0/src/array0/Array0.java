package array0;

import java.util.Scanner;

public class Array0 {

    public static void main(String[] args) {
        int s = 0;
        Scanner ss = new Scanner(System.in);
        int arr[] = new int[10];
        System.out.println("enter number of array");
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = ss.nextInt();
            s += arr[i];
        }
        
        for(int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println("the sum: " +s);
    }
    
}
