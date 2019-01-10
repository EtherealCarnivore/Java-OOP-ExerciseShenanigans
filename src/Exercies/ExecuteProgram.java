package Exercies;

import Exercies.Exercise01.BankAccount;
import Exercies.Exercise02.VipCustomer;
import Exercies.Exercise03.SpecificCar;

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

        SpecificCar car = new SpecificCar("LamboBABY");

        car.ChangeGears(10);
        car.ChangeSpeed(-20);
        car.HandSteer();


    }
}
