package Exercies.Exercise03;

public class SpecificCar extends Car {
    public SpecificCar(String model) {
        super(model);
    }
    private int windows = 4;

    public int getWindows() {
        return windows;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }

    public void Special(){
        System.out.println("Hello there, I am a special car and my class is inherited from 2 other classes. This is the worst way you can use OOP. I'm sorry");
    }
}
