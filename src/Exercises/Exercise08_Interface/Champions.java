package Exercises.Exercise08_Interface;

import java.util.ArrayList;

public class Champions implements ISave{

    private String name;
    private int damage;
    private String ultimate;

    public Champions(String name, int damage, String ultimate) {
        this.name = name;
        this.damage = damage;
        this.ultimate = ultimate;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUltimate() {
        return ultimate;
    }

    public void setUltimate(String ultimate) {
        this.ultimate = ultimate;
    }

    @Override
    public String toString(){
        return "The Champion " + name + " has " + damage + " and the ultimate is " + ultimate;
    }

    @Override
    public ArrayList<String> write() {
        ArrayList<String> values = new ArrayList<>();
        values.add(0, this.name);
        values.add(1,"" + this.damage);
        values.add(2, this.ultimate);
        return values;
    }

    @Override
    public void read(ArrayList<String> savedValues) {
    if (savedValues != null && savedValues.size() > 0){
        this.name = savedValues.get(0);
        this.damage = Integer.parseInt(savedValues.get(1));
        this.ultimate = savedValues.get(2);

    }
    }
}
