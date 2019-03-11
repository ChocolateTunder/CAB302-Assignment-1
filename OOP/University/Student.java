package oop.University;

public class Student extends Academic {
    double stipend;
    String toString;

    public Student(Title title, int id, String name, double stipend){
        super(title, id, name);
        this.stipend = stipend;
    }


    public double getWeeklyPay(){
        return stipend;
    };

    public String toString(){
        //[class] [id] (studies a) / (works as a) [title]
        String degree = super.getTitle().toString();
        toString = ("Student "+super.getID()+" studies a "+degree+"");
        return toString;
    };
}
