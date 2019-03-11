package oop.Shapes;

public class Cone  implements Shape{
    double radius, height;

    public Cone (double radius, double height){
        this.radius = radius;
        this.height = height;
    }

    public double volume(){
        return Math.PI*(radius*radius)*(height/3);
    }

    public double surfaceArea(){
        return Math.PI*radius*(radius + Math.sqrt((height*height)+(radius*radius)));
    }
}
