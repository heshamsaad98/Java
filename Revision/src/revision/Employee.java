/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revision;

/**
 *
 * @author Hesham
 */

enum Gender{male, female};

public abstract class Employee {
    String name;
    String address;
    int ssn;
    Gender sex;

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public void setSex(Gender sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getSsn() {
        return ssn;
    }

    public Gender getSex() {
        return sex;
    }
    
    public Employee() {
        
    }

    public Employee(String name, String address, int ssn, Gender sex) {
        this.name = name;
        this.address = address;
        this.ssn = ssn;
        this.sex = sex;
    }
    
    public abstract double earnings();

    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", address=" + address + ", ssn=" + ssn + ", sex=" + sex + '}';
    }
}
