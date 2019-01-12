package Exercises;

import Exercises.Exercise06Polymorphism.Renault;
import Exercises.Exercise06Polymorphism.Suzuki;
import Exercises.Exercise07MasterChallenge.DeluxeHamburger;
import Exercises.Exercise07MasterChallenge.Hamburger;
import Exercises.Exercise07MasterChallenge.HealthyBurger;

import java.util.Scanner;

public class ExecuteProgram {
    public static void main(String[] args) {
        int toppingsAllowed = 0;
        boolean healthy = false;
        String bread;
        String splitToppings[];
        String toppings;
        Scanner input = new Scanner(System.in);
        System.out.println("Which kind of burger would you like: ");
        System.out.println("1. Standard (Vegan or with Meat \r\n" +
                "2. Healthy burger which can have 6 toppings \r\n" +
                "3. Deluxe burger which comes with chips and a drink");
        String hambugerName  = input.nextLine();


        switch(hambugerName){
            case "Vegan":
                toppingsAllowed = 4;
                break;
            case "Meat":
                toppingsAllowed = 4;

                break;
            case "Healthy":
                toppingsAllowed = 6;
                healthy = true;
                break;
            case "Deluxe":
                toppingsAllowed = 0;
                break;
        }
        if (!healthy){
            System.out.println("What kind of bread would you like?");
            bread = input.nextLine();
        } else
        {
            bread = "The bread is in your imagination. You are in a coma, we have been trying to wake you up for years.. Listen to us!!!!";
        }



        System.out.println("What kind of meat would you like?");
        String meat = input.nextLine();

        if (toppingsAllowed > 0){

            System.out.println("What extra toppings would you like? ");
             toppings = input.nextLine();
            splitToppings = toppings.split(",");
        } else
        {
            toppings = "Chips and Coke";
            splitToppings = toppings.split(",");
        }



        int toppingsCount = splitToppings.length;

        switch (hambugerName){
            case "Vegan":
                Hamburger vegan = new Hamburger(hambugerName, bread, meat, toppings);
                vegan.calculatePrice(toppingsCount);
                System.out.println("You added " + toppings + " to your burger");

                break;
            case "Meat":
                Hamburger animalkiller = new Hamburger(hambugerName, bread, meat, toppings);
                animalkiller.calculatePrice(toppingsCount);
                System.out.println("You added " + toppings + " to your burger");
                break;
            case "Healthy":

                HealthyBurger imsocool = new HealthyBurger(hambugerName, bread, meat, toppings);
                imsocool.calculatePrice(toppingsCount);
                System.out.println("The healthy burger comes with " + imsocool.getBreadType() + " bread!");
                System.out.println("You added " + toppings + " to your burger");
                break;

            case "Deluxe":
                DeluxeHamburger bigmoney = new DeluxeHamburger(hambugerName, bread, meat, toppings);
                bigmoney.calculatePrice();
                System.out.println("You also ordered " + toppings + " with your burger");
                break;
                default:
                    System.out.println("There is no such burgerino, go backerino");
                break;
        }



    }
}
