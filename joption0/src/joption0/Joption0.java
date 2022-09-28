package joption0;

import java.util.Scanner;

public class Joption0 {

    public static void main(String[] args) {
        double w, h;
        System.out.println("enter width: ");
        Scanner s = new Scanner(System.in);
        w = s.nextDouble();
        
        System.out.println("enter height: ");
        h = s.nextDouble();
        
        System.out.println("the area is: " + (h*w));
    }
    
}
