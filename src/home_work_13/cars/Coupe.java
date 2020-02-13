package cars;

public class Coupe implements Car {
    private int id;
    private int prise;
    private int speed;
    private int fuelConsumption;
    private int capacity;
    private String color;

    public Coupe(int id, int prise, int speed, int fuelConsumption, int capacity, String color) {
        this.id = id;
        this.prise = prise;
        this.speed = speed;
        this.fuelConsumption = fuelConsumption;
        this.capacity = capacity;
        this.color = color;
    }

    public int compare(Car o2) {
        return this.getFuelConsumption() - o2.getFuelConsumption();
    }

    public byte[] toOutput() {
        return ("Coupe," + getId() + "," + getPrise() + "," + getSpeed() + "," + getFuelConsumption() + "," + capacity +
                "," + color + ";\r\n").getBytes();
    }

    @Override
    public String toString() {
        return "Coupe #" + getId() + ", prise = " + getPrise() + "$" + ", color = " + color + ", speed = " + getSpeed()
                + " m/h" + ", capacity = " + capacity + " people" + ", fuel consumption = " + getFuelConsumption();

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
