package OOP_Composition;

public class Computer {
    private Motherboard motherboard;
    private PSU psu;
    private CPU cpu;

    public Computer(Motherboard motherboard, PSU psu, CPU cpu) {
        this.motherboard = motherboard;
        this.psu = psu;
        this.cpu = cpu;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }

    public PSU getPsu() {
        return psu;
    }

    public void setPsu(PSU psu) {
        this.psu = psu;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }
}
