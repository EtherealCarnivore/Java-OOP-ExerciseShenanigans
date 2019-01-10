package OOP_Polymorphism;

public class Shape {
    int radius;

    public Shape(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public void printShape(){
        System.out.println("print shape");
    }
}
