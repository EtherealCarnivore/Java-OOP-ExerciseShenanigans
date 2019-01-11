package Exercises.Exercise04.Composition;

public class Room {
    private Furniture furnite;
    private Windows windows;
    private Plants plants;

    public Room(Furniture furnite, Windows windows, Plants plants) {
        this.furnite = furnite;
        this.windows = windows;
        this.plants = plants;
    }

    public Furniture getFurnite() {
        return furnite;
    }

    public void setFurnite(Furniture furnite) {
        this.furnite = furnite;
    }

    public Windows getWindows() {
        return windows;
    }

    public void setWindows(Windows windows) {
        this.windows = windows;
    }

    public void setPlants(Plants plants) {
        this.plants = plants;
    }

    public Plants getPlants() {
        return plants;

    }

    public static void Access(){
        System.out.println("Sh ti eba maikata i indiieca nauchi se da pishesh maina?????");
    }

    public void poleiGoPap(){
        System.out.println("Ebati polivaneto deto stane");
        plants.polei();
    }



}
