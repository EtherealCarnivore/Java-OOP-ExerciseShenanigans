package Exercises.Exercise06Polymorphism;

public class Suzuki extends CarGeneric {
    public Suzuki(int cylinders, String model) {
        super(cylinders, model);
    }
    @Override
    public void startEngine() {
        System.out.println("You just started the engine of the Suzuki " + getModel() + "!");
    }
    @Override
    public void accelerate() {
        System.out.println("You just change the speed of the Suzuki " + getModel() + ".");
    }

    @Override
    public void brake() {
        System.out.println("You just pressed the breaks of the " + getModel());
    }



}
