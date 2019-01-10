package Exercies.Exercise03;
// Exercise 3
public class Vehicle {
    private int speed = 10;
    private int gears = 1;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    public void HandSteer(){
        System.out.println("You are now steering with one hand");
    }

    public void ChangeGears(int gears){
        this.gears += gears;
        System.out.println("You changed from gear 1 to " + this.gears + "!");
    }

    public void ChangeSpeed(int change){
        System.out.println("Your initial speed was " + this.speed);
        this.speed += change;
        System.out.println("Now you have increased your speed by " + change + " and your total speed is " + this.speed);
    }
}
