package Exercises.Exercise10_Abstract_LinkedList;

public class main {
    public static void main(String[] args) {


        // Exercise 10, abstract class, interface + custom linked list.. pff

        CustomList list = new CustomList(null); //innit list
        list.traverse(list.getRoot()); //check if list is empty

        String fillList = "Maiev Kerrigan Mephisto Abathur Stukov Alarak Genji";

        String[] listData = fillList.split(", ");

        for (String s: listData) {
            list.addItem(new Node(s));
        }

        list.traverse(list.getRoot()); //get starting item and go through the list && print
        list.removeItem(new Node("Stukov")); //test delete
        list.traverse(list.getRoot()); //print and hope Stukov is gone :D

        // IT WORKS :B
    }
}
