package OOP_Polymorphism;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<Shape> shapeArrayList = new ArrayList<>();
        Cricle cricle = new Cricle(4);
        Triangle triangle = new Triangle(4);
        shapeArrayList.add(cricle);
        shapeArrayList.add(triangle);

        for (Shape shape :
                shapeArrayList) {
            shape.printShape();
        }
    }
}
