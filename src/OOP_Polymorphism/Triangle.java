package OOP_Polymorphism;

public class Triangle extends Shape {
    public Triangle(int radius) {
        super(radius);
    }
    @Override
    public void printShape(){
        System.out.println("print triangle");
    }
}
