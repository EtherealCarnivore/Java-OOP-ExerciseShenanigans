package Exercises.Exercise07MasterChallenge;

public class HealthyBurger extends Hamburger {
    public HealthyBurger(String name, String breadType, String meatType, String additions) {
        super(name, breadType, meatType, additions);
        setBreadType("Some brown shit");
        setPrice(3);

    }

    @Override
    public void calculatePrice(int extra) {
         int totalPrice;
         totalPrice = getPrice() + extra * getExtraPrice();
        System.out.println("That will be " + totalPrice + ", the burger " + getName() + " costs " + getPrice()+
                " and you added " + extra + " toppings which are charged 1$ and amount to " + (extra * getExtraPrice()));
    }
}
