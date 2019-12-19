package HomeWork7;

public class Bus extends Car {

    private int capacity;

    public Bus(String markAuto, String fuelType, int fuelConsumption, double speed,int cost, int capacity) {
        super(markAuto, fuelType, fuelConsumption, speed, cost);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Mark: " + getMarkAuto() +  ", cost: " + getCost() + "$" +
                ", fuel consumption: " + getFuelConsumption() + ", normal speed: " + getSpeed() + " m/h" +
                ", capasity: " + capacity + " people";
    }

}


