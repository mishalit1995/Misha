package cars;

public interface Car {

    int getId();

    int getPrise();

    int getSpeed();

    int getFuelConsumption();

    byte[] toOutput();

    int compare(Car o2);

}
