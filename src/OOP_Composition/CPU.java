package OOP_Composition;

public class CPU {
    private String model;
    private int voltage;

    public CPU(String model, int voltage) {
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
