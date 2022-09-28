package if0;

import java.util.Scanner;

public class If0 {

    public static void main(String[] args) {
        int x, y;
        Scanner s = new Scanner(System.in);
        System.out.println("entex x: ");
        x = s.nextInt();
        System.out.println("enter y: ");
        y = s.nextInt();
        
        if(y != 0)
            System.out.println(x/y);
        else
            System.out.println("no div by 0");
    }
    
}
