/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop8;

public class Person {
    String name;
    double age;
    String address;
    String nationality;
    
    public Person(){}
    
    public Person(String n, double a, String ad, String net)
    {
        name = n;
        age = a;
        address = ad;
        nationality = net;
    }
    
    public void setName(String n)
    {
        name = n;
    }
    
    public void setAge(double a)
    {
        age = a;
    }
    
    public void setAddress(String ad)
    {
        address = ad;
    }
    
    public void setNationality(String net)
    {
        nationality = net;
    }
    
    public String getName()
    {
        return name;
    }

    public double getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getNationality() {
        return nationality;
    }
    
    public void printAllDetails()
    {
        System.out.println("Name: " + name + "\n Age: " + age + "\n Nationality: " + nationality + "\n Address: " + address);
    }
}
