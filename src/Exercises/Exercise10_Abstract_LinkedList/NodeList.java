package Exercises.Exercise10_Abstract_LinkedList;

public interface NodeList {

    ListItem getRoot();
    boolean addItem(ListItem item);
    boolean removeItem (ListItem item);
    void traverse(ListItem root);
}
