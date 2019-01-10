package OOP_Inharitance;

public class Car {

    private int wheels;
    private String model;
    public static final int P = 3;


    public Car(int wheels, String model) {
        this.wheels = wheels;
        this.model = model;
    }

    public static void staticPrint(){
        System.out.println("YOU CAN PRINT ME");
    }

    public void printSTUFF(int a){
        System.out.println(a);
    }

    public void printSTUFF(int a,int b){
        System.out.println(a+b);
    }

    public void printSTUFF(int a,int b,int c){
        System.out.println(a+b+c);
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void primerZaKoceto(){
        System.out.println("TOVA E V CAR");
    }

}
