package HomeWork7;

public class PassengerCar extends Car {

    private String bodyType;

    public PassengerCar(String markAuto, String fuelType, double fuelConsumption, double speed, int cost, String bodyType) {
        super(markAuto, fuelType, fuelConsumption, speed, cost);
        this.bodyType = bodyType;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    @Override
    public String toString() {
        return "Mark: " + getMarkAuto() + ", cost: " + getCost() + "$" +
                ", body type: " + bodyType + ", fuel consumption: " + getFuelConsumption() +
                ", normal speed: " + getSpeed() + " m/h";
    }
}
