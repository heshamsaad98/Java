package oop2;

public class Oop2 {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        System.out.println(r1.getLength() + "\t" + r1.getWidth());
        
        r1.setLength(25);
        r1.setWidth(30);
        System.out.println(r1.getLength() + "\t" + r1.getWidth());
        
        Rectangle r2 = new Rectangle(30, 50);
        System.out.println(r2.getLength() + "\t" + r2.getWidth());
    }
    
}
