package oop7;

public class Student extends Person {
    int study_level;
    String specialization;
    double GPA;

    public int getStudy_level() {
        return study_level;
    }

    public String getSpecialization() {
        return specialization;
    }

    public double getGpa() {
        return GPA;
    }

    public void setStudy_level(int study_level) {
        this.study_level = study_level;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setGpa(double gpa) {
        this.GPA = gpa;
    }

    public Student() 
    {
    }
    
    public Student(String n, double a, String ad, String nad, int lvl, String special, double gpa)
    {
        super(n, a, ad, nad);
        study_level = lvl;
        specialization = special;
        GPA = gpa;
    }
    
}
