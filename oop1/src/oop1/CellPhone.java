package oop1;

public class CellPhone {
    private String manufact;
    private String model;
    private double retailPrice;
    
    public void setManufact(String m)
    {
        manufact = m;
    }
    
    public void setModel(String mo)
    {
        model = mo;
    }
    
    public void setRetailPrice(double r)
    {
        retailPrice = r;
    }
    
    public String getManufact()
    {
        return manufact;
    }
    
    public String setModel()
    {
        return model;
    }
    
    public double gettRetailPrice()
    {
        return retailPrice;
    }
}
