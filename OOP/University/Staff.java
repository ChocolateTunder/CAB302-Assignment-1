package oop.University;

public class Staff extends Academic {
    private int hours;
    private String toString;

    public Staff(Title title, int id, String name){
        super(title, id, name);
    }

    public void setHours(int hours){
        this.hours = hours;
    }

    public String text(){
        String a = super.getTitle().toString();
        return a;
    }

    public double getWeeklyPay(){
        double pay;
        if (super.getTitle().toString().equals(Title.LECTURER.toString())){
            pay = 75000.0/52.0;
            return pay;
        } else if(super.getTitle().toString().equals(Title.TUTOR.toString())){
            return hours * 35;
        } else {
            return 0;
        }
    };

    public String toString(){
        //[class] [id] (studies a) / (works as a) [title]
        String degree = super.getTitle().toString();
        toString = ("Staff "+super.getID()+" works as a "+degree+"");
        return toString;
    };
}
