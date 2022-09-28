package if2;

import javax.swing.JOptionPane;

public class If2 {

    public static void main(String[] args) {
       int x, y;
       x = Integer.parseInt(JOptionPane.showInputDialog("enter x"));
       y = Integer.parseInt(JOptionPane.showInputDialog("enter y"));
       
       if(x > 10)
       {
           if(y < 0)
           {
               System.out.println("Code1");
           }
           else
           {
               System.out.println("error1");
           }
       }
       else
       {
           System.out.println("error");
       }
    }
    
}
