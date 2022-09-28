package if1;

import java.util.Scanner;

public class If1 {

    public static void main(String[] args) {
        int x, y;
        Scanner s = new Scanner(System.in);
        System.out.println("enter x: ");
        x = s.nextInt();
        
        System.out.println("enter y: ");
        y = s.nextInt();
        
        if(x < y)
        {
            System.out.println("x < y");
        }
        else if(x > y)
        {
            System.out.println("x > y");   
        }
        else
        {
            System.out.println("x = y");
        }
    }
    
}
