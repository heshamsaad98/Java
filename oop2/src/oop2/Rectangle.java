package oop2;

public class Rectangle {
    private double length;
    private double width;
    
    public Rectangle()
    {
        length = 10;
        width = 15;
        System.out.println("a new room created with 10m length and 50m width");
    }
    
    public Rectangle(double l, double w)
    {
        length = l;
        width = w;
    }
    
    public void setLength(double l)
    {
        length = l;
    }
    
    public void setWidth(double w)
    {
        width = w;
    }
    
    public double getLength()
    {
        return length;
    }
    
    public double getWidth()
    {
        return width;
    }
    
    public double getArea()
    {
        return length * width;
    }
}
