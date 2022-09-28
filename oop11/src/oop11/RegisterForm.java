package oop11;

enum Gender{Male, Female};
enum Course{Database, Programming, Math, ERP};
enum Semester{Summer, Winter, Fall, Spring};

public class RegisterForm {
    String stdname;
    Gender stdgender;
    Course crs;
    Semester sem;
    
    public RegisterForm()
    {
        stdname = "No Name";
        stdgender = Gender.Male;
        crs = Course.Math;
        sem = Semester.Spring;
    }
    
    
}
