package oop.Shapes;

public class SquarePyramid implements Shape {
    double edge, height;

    public SquarePyramid (double edge, double height){
        this.edge = edge;
        this.height = height;
    }

    public double volume(){
        return (edge*edge)*(height/3);
    }

    public double surfaceArea(){
        return (edge*edge)+(2*edge*Math.sqrt(((edge*edge)/4) + (height * height)));
    }
}
