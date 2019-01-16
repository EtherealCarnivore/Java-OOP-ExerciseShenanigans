package Exercises.Exercise10_Abstract_LinkedList;

public class Node extends ListItem {
    public Node(Object value) {
        super(value);
    }


    //Create logic for implemented methods
    @Override
    ListItem next() {
        return this.rightLink;
    }

    @Override
    ListItem setNext(ListItem item) {
        this.rightLink = item;
        return this.rightLink;
        // set value
    }

    @Override
    ListItem previous() {
        return this.leftLink;
    }

    @Override
    ListItem setPrevious(ListItem item) {
        this.leftLink = item;
        return  this.leftLink;
        // set value
    }

    @Override
    int compareTo(ListItem item) {
        if (item != null){
            return ((String) super.getValue()).compareTo((String) item.getValue());
            //compare value of object and item inserted
        } else{
            return -1;
        }
    }
}
