package oop4;

public class Car {
    private String maker;
    private int model;
    private static int no_of_object;
    
    public Car()
    {
        maker = "Honda";
        model = 2018;
        no_of_object ++;   
    }
    
    public Car(String m, int mo)
    {
        maker = m;
        model = mo;
        no_of_object ++;   
    }
    
    public static int getNoOfObject()
    {
        return no_of_object;
    }
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
