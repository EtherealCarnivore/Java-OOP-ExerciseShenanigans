package Exercies.Exercise02;
//Exercises 02 solution

public class VipCustomer {
    private String name = "default";
    private int creditLimit = 10;
    private String email = "email";


    public VipCustomer() {
        this.name = getName();
        this.creditLimit = getCreditLimit();
        this.email = getEmail();

    }

    public VipCustomer(String name, int creditLimit) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = getEmail();
    }

    public VipCustomer(String name, int creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
