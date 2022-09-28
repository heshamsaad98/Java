package oop5;

public class Rectangle {
    private double length;
    private double width;
    
    public Rectangle(){}
    
    public Rectangle(double l, double w)
    {
        length = l;
        width = w;
    }
    public void setLength(double l)
    {
        l = 70;
        length = l;
    }
    
    public void modifyobject(Rectangle r)
    {
        r.length = 67;
        r.width = 98;
    }
    
    public Rectangle add(Rectangle room1)
    {
        Rectangle result = new Rectangle();
        result.length = this.length + room1.length;
        result.width = this.width + room1.width;
        
        return result;
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
