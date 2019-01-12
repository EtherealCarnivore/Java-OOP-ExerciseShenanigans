package Exercises.Exercise07MasterChallenge;

public class Hamburger {
    private String name;
    private String breadType;
    private String meatType;
    private String additions;
    private int price;
    private int extra;
    private int extraPrice;
    private int totalPrice;

    public Hamburger(String name, String breadType, String meatType, String additions) {

        switch (name) {
            case "Vegan":
                this.name = "Vegan";
                this.price = 2;
                break;
            case "Meat":
                this.name = "Meat";
                this.price = 3;
                break;
            default:
                this.name = "Nope";
                break;
        }

        this.breadType = breadType;
        this.meatType = meatType;
        this.additions = additions;
        this.name = name;
        this.extra = extra;
        this.extraPrice = 1;
        this.totalPrice = 0;
        this.price = 0;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreadType() {
        return breadType;
    }

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    public String getMeatType() {
        return meatType;
    }

    public void setMeatType(String meatType) {
        this.meatType = meatType;
    }

    public String getAdditions() {
        return additions;
    }

    public void setAdditions(String additions) {
        this.additions = additions;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getExtra() {
        return extra;
    }

    public void setExtra(int extra) {
        this.extra = extra;
    }

    public int getExtraPrice() {
        return extraPrice;
    }

    public void setExtraPrice(int extraPrice) {
        this.extraPrice = extraPrice;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void calculatePrice(int extra) {

        totalPrice = price + extra * extraPrice;
        System.out.println("That will be " + totalPrice + ", the burger " + this.name + " costs " + this.price +
                " and you added 4 toppings which are charged 1$ and amount to " + (extra * this.extraPrice));
    }
}



