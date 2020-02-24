package cars;

public class Bus implements Car {
    private int id;
    private int prise;
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

    public int compare(Car o2) {
        return this.getFuelConsumption() - o2.getFuelConsumption();
    }

    @Override
    public byte[] toOutput() {
        return ("Bus," + getId() + "," + getPrise() + "," + getSpeed() + "," + getFuelConsumption() + "," +
                capacity + ";\r\n").getBytes();
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
