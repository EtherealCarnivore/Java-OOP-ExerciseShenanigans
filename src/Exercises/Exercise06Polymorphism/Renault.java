package Exercises.Exercise06Polymorphism;

public class Renault extends CarGeneric {
    public Renault(int cylinders, String model) {
        super(cylinders, model);
    }

    @Override
    public void startEngine() {
        System.out.println("You just started the engine of the Renault " + getModel() + "!");
    }
    @Override
    public void accelerate() {
        System.out.println("You just change the speed of the Renault " + getModel() + ".");
    }

    @Override
    public void brake() {
        System.out.println("You just pressed the breaks of the " + getModel());
    }
}
