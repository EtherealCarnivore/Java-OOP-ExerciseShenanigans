package Exercises.Exercise08_Interface;

import java.util.ArrayList;

public class Enemy implements ISave {

    private String name;
    private int damage;
    private int health;
    private String type;

    public Enemy(String name, int damage, int health, String type) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    @Override
    public String toString(){
        return "The enemy " + name + " has " + damage + ", health " + health + " and his alligence is " + type;
    }

    @Override
    public ArrayList<String> write() {
        ArrayList<String> enemyValues = new ArrayList<>();
        enemyValues.add(0, this.name);
        enemyValues.add(1, "" + this.damage);
        enemyValues.add(2, "" + this.health);
        enemyValues.add(3, this.type);
        return enemyValues;
    }

    @Override
    public void read(ArrayList<String> savedValues) {
        if (savedValues != null && savedValues.size() > 0){
            this.name = savedValues.get(0);
            this.damage = Integer.parseInt(savedValues.get(1));
            this.health = Integer.parseInt(savedValues.get(2));
            this.type = savedValues.get(3);

        }

    }
}
