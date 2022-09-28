/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop10;

/**
 *
 * @author Hesham
 */
public class CD implements RetailItem, Desplayable{
    double price;
    String title;
    String artist;

    public CD(double price, String title, String artist) {
        this.price = price;
        this.title = title;
        this.artist = artist;
    }
    
    public CD(){}
    
    @Override
    public double getItemPrice()
    {
        return price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void display() {
        System.out.println("Store: " + storename + ", Title: " + title + ", Price: " + price + ", Artist: " + artist);
    }
    
}
