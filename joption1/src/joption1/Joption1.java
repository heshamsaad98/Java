package joption1;

import javax.swing.JOptionPane;

public class Joption1 {

    public static void main(String[] args) {
        float r, area;
        final float pi = 3.14f;
        r = Float.parseFloat(JOptionPane.showInputDialog("enter raduies for circle"));
        area = (float) (pi * Math.pow(r, 2));
        JOptionPane.showMessageDialog(null, "the area is: " + area);
    }
    
}
