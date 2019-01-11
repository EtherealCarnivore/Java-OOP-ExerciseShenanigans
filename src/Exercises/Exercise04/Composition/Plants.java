package Exercises.Exercise04.Composition;

public class Plants {
    private String type = "roza";
    public int age;

    public Plants(String type, int age) {
        this.type = type;
        this.age = age;
    }

    public String PrintPlant(String bate){
        System.out.println(bate);
     return bate;
    }

    public void polei(){
        System.out.println("Polqx go");
    }
}
