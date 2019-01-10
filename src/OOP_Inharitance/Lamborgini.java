package OOP_Inharitance;

public class Lamborgini extends Car {

    private int turbines;

    public Lamborgini(int wheels, String model) {

        super(wheels, model);
    }

    public Lamborgini(int wheels) {

        super(wheels, "sad");

    }

    public void veryFast(){
        System.out.println("Lambo is very fast");
    }

    @Override
    public void primerZaKoceto(){
        System.out.println("TOVA E V LAMBORGINI");
    }

}