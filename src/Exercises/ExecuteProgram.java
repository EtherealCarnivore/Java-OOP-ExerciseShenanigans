package Exercises;

import Exercises.Exercise06Polymorphism.Renault;
import Exercises.Exercise06Polymorphism.Suzuki;

public class ExecuteProgram {
    public static void main(String[] args) {
//        BankAccount poorBitch = new BankAccount();
//
//        poorBitch.Deposit(20);
//
//        poorBitch.Withdrawl(60);
//
//        VipCustomer customer = new VipCustomer();
//
//        System.out.println(customer.getName());

//        SpecificCar car = new SpecificCar("LamboBABY");
//
//        car.ChangeGears(10);
//        car.ChangeSpeed(-20);
//        car.HandSteer();

//        Furniture mirela = new Furniture("armchair", 1, "black");
//        Plants orhid = new Plants("orhid", 2);
//        Windows krugli = new Windows("krugli", 1);
//
//        Room hola = new Room(mirela, krugli, orhid);
//
//        hola.getPlants().PrintPlant("miri");
//
//        hola.getPlants().PrintPlant("asd");
//
//        hola.Access();
//
//        hola.poleiGoPap();

//        Printer philips= new Printer(50, false);
//
//        philips.AddToner(50);
//
//        philips.Print(10);
//
//        Printer hp = new Printer(101, true);
//
//        hp.getTonerLevel();
//
//        hp.Print(10);



        Suzuki maruti = new Suzuki(6, "Maruti");

        maruti.startEngine();

        maruti.accelerate();

        maruti.brake();

        System.out.println("Number of wheels " + maruti.getWheels() + " of the " + maruti.getModel());

        System.out.println(maruti.isEngine() ? "The " + maruti.getModel() + " has an engine" : "Now.. where did you put that engine? God damn it, NIKOLA, god damn it.");

        Renault clio = new Renault(2, "clio");

        clio.startEngine();

        clio.accelerate();

        System.out.println("Number of wheels " + clio.getWheels() + " of the " + clio.getModel());

        System.out.println(clio.isEngine() ? "The " + clio.getModel() +  " has an engine" : "Now.. where did you put that engine? God damn it, Karen, god damn it.");









    }
}
