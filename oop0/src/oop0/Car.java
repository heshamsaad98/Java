package oop0;

public class Car {
    private String maker;
    private int model;
    
    public void setMaker(String m)
    {
        if(m == "toyota" || m == "honda" || m == "merceds")
            maker = m;
        else
            System.out.println("Invalid Maker");
    }
    
    public void setModel(int year)
    {
        if(year > 2010)
            model = year;
        else
            System.out.println("Invalid Model");
    }
    
    public String getMaker()
    {
        return maker;
    }
    
    public int getModel()
    {
        return model;
    }
}
