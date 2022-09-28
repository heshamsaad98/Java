package if3;

import java.util.Scanner;

public class If3 {

    public static void main(String[] args) {
        float s; 
        float per;
        Scanner ss = new Scanner(System.in);
        System.out.println("enter total digree");
        s = ss.nextInt();
        per = (s/600)*100;
        System.out.println(per+"%");
        if(per >= 50 && per <= 65)
        {
            System.out.println("D");
        }
        else if(per > 65 && per <= 75)
        {
            System.out.println("C");
        }
        else if(per > 75 && per <= 85)
        {
            System.out.println("B");
        }
        else if(per > 85 && per <= 100)
        {
            System.out.println("A");
        }
        else
        {
            System.out.println("F");
        }
    }
    
}
