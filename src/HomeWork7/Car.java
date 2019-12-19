package HomeWork7;

public class Car {

    private String markAuto;
    private String fuelType;
    private double fuelConsumption;
    private  double speed;
    private int cost;

    public Car(String markAuto, String fuelType, double fuelConsumption, double speed, int cost) {
        this.markAuto = markAuto;
        this.fuelType = fuelType;
        this.fuelConsumption = fuelConsumption;
        this.speed = speed;
        this.cost = cost;
    }

    public String getMarkAuto() {
        return markAuto;
    }

    public void setMarkAuto(String markAuto) {
        this.markAuto = markAuto;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
