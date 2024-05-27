package web.models;

public class Car {
    private String label;
    private String model;
    private int regNumber;

    public Car() {
    }

    public Car(String label, String model, int regNumber) {
        this.label = label;
        this.model = model;
        this.regNumber = regNumber;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(int regNumber) {
        this.regNumber = regNumber;
    }

    @Override
    public String toString() {
        return "Car: " + label + " " + model + ", RN - " + regNumber + '.';
    }
}