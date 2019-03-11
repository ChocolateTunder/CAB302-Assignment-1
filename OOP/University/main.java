package oop.University;

public class main {
    public static void main(String[] args){
        Staff lecture;
        lecture = new Staff(Title.LECTURER, 1, "Dude");
        Academic tute = new Staff(Title.TUTOR, 2, "Mate");

        System.out.println(lecture.getWeeklyPay());
        //System.out.println(tute.toString);
    }
}
