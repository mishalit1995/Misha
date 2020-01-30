package cars;

public class Bus implements Car {
    private int id;
    private  int prise;
    private int speed;
    private int fuelConsumption;
    private int capacity;

    public Bus(int id, int prise, int speed, int fuelConsumption, int capacity) {
        this.id = id;
        this.prise = prise;
        this.speed = speed;
        this.fuelConsumption = fuelConsumption;
        this.capacity = capacity;
    }

    public Bus(String[] carProperties) {
        this(Integer.parseInt(carProperties[1]), Integer.parseInt(carProperties[2]), Integer.parseInt(carProperties[3]),
                Integer.parseInt(carProperties[4]), Integer.parseInt(carProperties[5]));

    }

    public String toOutput() {
        return "Bus," + getId() + "," + getPrise() + "," + getSpeed() + "," + getFuelConsumption() + "," +
                 capacity;
    }

    @Override
    public String toString() {
        return "Bus #" + getId() + ", prise = " + getPrise() + "$" + ", speed = " + getSpeed() + " m/h" + ", capacity = "
                + capacity + " people" + ", fuel consumption = " + getFuelConsumption();

    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public int getPrise() {
        return prise;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public int getFuelConsumption() {
        return fuelConsumption;
    }

}
