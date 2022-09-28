package function1;

import javax.swing.JOptionPane;

public class Function1 {

    public static void main(String[] args) {
        double n1, n2;
        int n, x;
        do
        {
            JOptionPane.showMessageDialog(null, "enter operartion: \n"
                    + "1-add\n 2-sub\n 3-mul\n 4-div\n 5-power\n 6-sqrt\n plase enter ok");
            n = Integer.parseInt(JOptionPane.showInputDialog("enter number for operation"));
            n1 =Double.parseDouble(JOptionPane.showInputDialog("enter first number"));
            n2 =Double.parseDouble(JOptionPane.showInputDialog("enter second number"));

            switch(n)
            {
                case 1:
                    JOptionPane.showMessageDialog(null, add(n1, n2));
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, sub(n1, n2));
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, mul(n1, n2));
                    break;
                case 4:
                    if(n2 == 0)
                        JOptionPane.showMessageDialog(null, "error");
                    else
                        JOptionPane.showMessageDialog(null, div(n1, n2));
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, power(n1, n2));
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, sq(n1));
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "invalid number");
            }
            x = Integer.parseInt(JOptionPane.showInputDialog("for anther operation enter 1\n for exit enter 0"));
        }
        while(x == 1);
    }
    
    static double add(double c1, double c2)
    {
        return c1 + c2;
    }
    
    static double sub(double c1, double c2)
    {
        return c1 - c2;
    }
    
    static double mul(double c1, double c2)
    {
        return c1 * c2;
    }
    
    static double div(double c1, double c2)
    {
        return c1 / c2;
    }
    
    static double power(double n, double b)
    {
        double v = 1;
        for(int i = 0; i < b; i++)
        {
            v *= n;
        }
        return v;
    }
    
    static double sq(double c1)
    {
        return Math.sqrt(c1);
    }
    
}
