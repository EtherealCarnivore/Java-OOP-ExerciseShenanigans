package Exercies.Exercise03;
// Exercises 03


public class Car extends Vehicle{
    private String model;

    public Car(String model) { //create car with model
        this.model = model;
    }

    public Car() { //innit car without model
    }

    public String getModel() {
        return model;
    }

    public void PrintModel(){
        System.out.println(model);
    }
}
