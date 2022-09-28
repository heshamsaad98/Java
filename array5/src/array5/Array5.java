package array5;

import java.util.Scanner;

public class Array5 {

    public static void main(String[] args) {
        int a[][] = new int[2][3];
        Scanner ss = new Scanner(System.in);
        for(int i = 0; i < a.length; i++)
        {
            for(int j = 0; j < a[i].length; j++)
            {
                a[i][j] = ss.nextInt();
            }
        }
        System.out.println("Array: ");
        for(int i = 0; i < a.length; i++)
        {
            for(int j = 0; j < a[i].length; j++)
            {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
    
}
