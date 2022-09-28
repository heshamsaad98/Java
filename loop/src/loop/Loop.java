package loop;

import javax.swing.JOptionPane;

public class Loop {

    public static void main(String[] args) {
        int x1, x2;
        String s;
        do
        {
            x1 = Integer.parseInt(JOptionPane.showInputDialog("enter number 1"));
            x2 = Integer.parseInt(JOptionPane.showInputDialog("enter number 2"));
            JOptionPane.showMessageDialog(null, "the sum is: " + (x1+x2));
            s = JOptionPane.showInputDialog("do you want other operatio?");
        }
        while("yes".equals(s));
    }
    
}
