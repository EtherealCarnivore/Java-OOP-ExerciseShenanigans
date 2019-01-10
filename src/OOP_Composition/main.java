package OOP_Composition;

public class main {
    public static void main(String[] args) {
//        CPU cpu = new CPU("intel",10);
//        PSU psu = new PSU("Corasir",10);
//        Motherboard motherboard= new Motherboard("Asus",10);
//
//        Computer computer = new Computer(motherboard,psu,cpu);
//
//        System.out.println(computer.getPsu().getModel());
//        System.out.println(
//                computer.getMotherboard().getModel()
//        );



        Computer computer = new Computer(
                new Motherboard("Asus",10),
                new PSU("Corasir",10),
                new CPU("intel",10));

        System.out.println(computer.getPsu().getModel());
        System.out.println(
                computer.getMotherboard().getModel()
        );
    }
}
