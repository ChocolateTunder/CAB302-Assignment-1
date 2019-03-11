package oop.Shapes;

public class main {
    public static void main(String[] args){
        Shape a, b, c;
        ShapeHandler d = new ShapeHandler();
        Shape[] shapeArray = new Shape[3];

        a = new Tetrahedron(5);
        b = new Cone(5, 5);
        c = new SquarePyramid(5, 5);

        shapeArray[0] = a;
        shapeArray[1] = b;
        shapeArray[2] = c;

        System.out.println(a.volume());
        System.out.println(b.volume());
        System.out.println(c.volume());
        System.out.println(ShapeHandler.volumeSum(shapeArray));
    }
}
