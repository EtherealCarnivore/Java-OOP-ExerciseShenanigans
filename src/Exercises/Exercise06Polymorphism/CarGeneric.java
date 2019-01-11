package Exercises.Exercise06Polymorphism;

public class CarGeneric {
    private boolean engine;
    private int wheels;
    private int cylinders;
    private String model;

    public CarGeneric(int cylinders, String model) {
        this.cylinders = cylinders;
        this.model = model;
        this.wheels = 4;
        this.engine = true;
    }

    public void startEngine() {
        System.out.println("You just started the engine of the generic car");

    }

    public void accelerate() {
        System.out.println("You just change the speed of the Pejo");
    }

    public void brake() {
        System.out.println("You just pressed the breaks of the generic car");
    }

    public boolean isEngine() {
        return engine;
    }

    public int getWheels() {
        return wheels;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getModel() {
        return model;
    }
}




