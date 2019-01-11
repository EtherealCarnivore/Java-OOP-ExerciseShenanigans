package Exercises;

import Exercises.Exercise04.Composition.Furniture;
import Exercises.Exercise04.Composition.Plants;
import Exercises.Exercise04.Composition.Room;
import Exercises.Exercise04.Composition.Windows;

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

        Furniture mirela = new Furniture("armchair", 1, "black");
        Plants orhid = new Plants("orhid", 2);
        Windows krugli = new Windows("krugli", 1);

        Room hola = new Room(mirela, krugli, orhid);

        hola.getPlants().PrintPlant("miri");

        hola.getPlants().PrintPlant("asd");

        hola.Access();

        hola.poleiGoPap();




    }
}
