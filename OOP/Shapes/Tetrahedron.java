package oop.Shapes;

public class Tetrahedron implements Shape{
    double edge;

    public Tetrahedron (double edge){
        this.edge = edge;
    }

    public double volume(){
        return (edge*edge*edge)/(6*Math.sqrt(2));
    }

    public double surfaceArea(){
        return Math.sqrt(3)*(edge*edge);
    }
}
