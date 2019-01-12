package Exercises.Exercise07MasterChallenge;

public class DeluxeHamburger extends Hamburger {
    public DeluxeHamburger(String name, String breadType, String meatType, String additions) {
        super(name, breadType, meatType, additions);
        setPrice(5);
    }

    public void calculatePrice() {
        int totalPrice;
        totalPrice = getPrice() +  2 * getExtraPrice();
        System.out.println("That will be " + totalPrice + ", the burger " + getName() + " costs " + getPrice()+
                " and you also received chips and a drink which were charged " + (2 * getExtraPrice()));
    }
}
