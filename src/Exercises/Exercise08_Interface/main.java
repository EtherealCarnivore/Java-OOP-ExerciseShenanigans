package Exercises.Exercise08_Interface;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        boolean incorrect = false;

        ArrayList<String> values = new ArrayList<>();
        Champions maiev = new Champions("Maiev", 150, "Warden's Cage");
        Enemy mephisto = new Enemy("Mephisto", 100, 500, "Demon");

        System.out.println("Hello there, welcome to the Nexus");
        System.out.println("This program will allow you to add a champion or an enemy to the battle!");
        System.out.println("To add a champion please enter valor, to add an enemy type evil or type exit to close the program");
        String flow = scanner.nextLine();

        switch (flow){
            case "valor":
                choice = "valor";
                loadData(maiev);
                saveData(maiev);
                break;
            case "evil":
                choice = "evil";
                loadData(mephisto);
                saveData(mephisto);
                break;
            case "exit":
                System.out.println("You chose to exit the program");
                break;
                default:
                    System.out.println("You entered an incorrect word, please re-start");
                    break;
        }


    }

    public static String choice;
    public  static Scanner scanner = new Scanner(System.in);

    public static ArrayList<String> readValues(){
        ArrayList<String> values = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);


        switch (choice){
            case "exit":
                System.out.println("You quit the program");
                break;
            case "valor":
                System.out.println("Enter the champion's name");
                String name = scanner.nextLine();
                values.add(name);
                System.out.println("Enter the champions damage: ");
                String damage = scanner.nextLine();
                values.add(damage);
                System.out.println("Add the champions ultimate: ");
                String ultimate = scanner.nextLine();
                values.add(ultimate);
                break;
            case "evil":
                System.out.println("Enter the enemy's name");
                String enemyName = scanner.nextLine();
                values.add(enemyName);
                System.out.println("Enter the enemy's damage: ");
                String enemyDamage = scanner.nextLine();
                values.add(enemyDamage);
                System.out.println("Add the enemy's health: ");
                String health = scanner.nextLine();
                values.add(health);
                System.out.println("Add the enemy's type: ");
                String type = scanner.nextLine();
                values.add(type);
                break;
                default:
                    System.out.println("You didn't enter a correct word");
                    break;




        }
        return values;
    }
    public static void saveData(ISave objectToSave){
        for (int i = 0; i < objectToSave.write().size(); i++){

            if (choice == "valor"){
                switch (i){
                    case 0:
                        System.out.println("Saving champion data.. ");
                        System.out.println("Saving champion name " + objectToSave.write().get(i));
                        break;
                    case 1:
                        System.out.println("Saving champion damage: " + objectToSave.write().get(i));
                        break;
                    case 2:
                        System.out.println("Saving the champion's ultimate: " + objectToSave.write().get(i));
                        System.out.println("All done, champion saved!");
                }
            } else {
                switch (i){
                    case 0:
                        System.out.println("Saving enemy data.. ");
                        System.out.println("Saving enemy name " + objectToSave.write().get(i));
                        break;
                    case 1:
                        System.out.println("Saving enemy damage: " + objectToSave.write().get(i));
                        break;
                    case 2:
                        System.out.println("Saving the enemy's health: " + objectToSave.write().get(i));
                        break;
                    case 3:
                        System.out.println("Saving the enemy's type: " + objectToSave.write().get(i));
                        System.out.println("All done, enemy saved!");
                        break;


            }



        }

    }
    }

    public static void loadData(ISave loadObject){
        ArrayList<String> values = readValues();
        loadObject.read(values);

    }

}


