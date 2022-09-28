package pkgswitch;

import javax.swing.JOptionPane;

public class Switch {

    public static void main(String[] args) {
        int x = Integer.parseInt(JOptionPane.showInputDialog("enter number"));
        
        switch(x)
        {
            case 1:
                System.out.println("A");
                break;
                
            case 2:
                System.out.println("B");
                break;
                
            case 3:
                System.out.println("B");
                break;
            
            case 4:
                System.out.println("D");
                break;
            default:
                System.out.println("invalet");
        }
    }
    
}
