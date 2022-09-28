package joption;

import javax.swing.JOptionPane;

public class Joption {

    public static void main(String[] args) {
        String name;
        name = JOptionPane.showInputDialog("enter your name: ");
        int age;
        age = Integer.parseInt(JOptionPane.showInputDialog("enter your age: "));
        System.out.println(name + "" + age);
    }
    
}
