package OOP_Polymorphism;

public class Cricle extends Shape {
    public Cricle(int radius) {
        super(radius);
    }

    @Override
    public void printShape() {
        System.out.println("print Circle");
    }
}
