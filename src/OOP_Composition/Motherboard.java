package OOP_Composition;

public class Motherboard {
    private String model;
    private int voltage;

    public Motherboard(String model, int voltage) {
        this.model = model;
        this.voltage = voltage;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getVoltage() {
        return voltage;
    }

    public void setVoltage(int voltage) {
        this.voltage = voltage;
    }
}
