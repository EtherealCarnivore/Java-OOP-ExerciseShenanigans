package Exercises.Exercise10_Abstract_LinkedList;

public class CustomList implements NodeList {

    private ListItem root = null; //checks for first item in list, default is null

    public CustomList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if (this.root == null) {
            //list is empty, so item becomes the start of the lsit
            this.root = newItem;
            return true;
        }

        ListItem currentItem = this.root;
        while (currentItem != null) { //while list not empty
            int comparison = (currentItem.compareTo(newItem));
            if (comparison < 0) {
                if (currentItem.next() != null) {
                    //newItem has greater string value
                    currentItem = currentItem.next();
                    return true;
                } else {
                    //there is no next item, so put item at the end of list
                    currentItem.setNext(newItem).setPrevious(currentItem);
                    return true;
                }


            } else if (comparison > 0) {
                //new item is less in string value
                if (currentItem.previous() != null) {
                    currentItem.previous().setNext(newItem).setPrevious(currentItem.previous());
                    newItem.setNext(currentItem).setPrevious(newItem);
                } else {
                    //the node with previous is the starting item
                    newItem.setNext(this.root).setPrevious(newItem);
                    this.root = newItem;
                }
                return true;
            } else {
                // == 0 equal
                System.out.println(newItem.getValue() + " is already present in the list. It was not added");
                return false;
            }
        }
        return false;
    }


    @Override
    public boolean removeItem(ListItem item) {
        if (item != null) {
            System.out.println("Deleting item " + item.getValue());
        }
        ListItem currentItem = this.root;
        while (currentItem != null) {
            int comparison = currentItem.compareTo(item);
            if (comparison == 0) {
                //found the item for deletion
                if (currentItem == this.root) {
                    this.root = currentItem.next(); //change the starting index to the next link in memory
                } else {
                    currentItem.previous().setNext(currentItem.next()); // a b c, if we are removing b, we need to move the link from a -> b, to a -> c
                    // this means we removed B and the link is now a -> b, not a -> b -> c
                    if (currentItem.next() != null) {
                        currentItem.next().setPrevious(currentItem.previous());
                        // set b to equal a, remove b
                    }
                }
                return true;
            } else if (comparison < 0) {
                currentItem = currentItem.next();
            } else { // > 0
                // item is greater than the one to be deleted
                // so item is not in the list list
                return false;

            }
        }
        // reached end of list without finding item to delete
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if (root == null){
            System.out.println("The list is empty");
        }else {
            while (root != null){
                System.out.println(root.getValue());
                root = root.next(); //set to next value in order to go through the list
            }
        }
    }
}


