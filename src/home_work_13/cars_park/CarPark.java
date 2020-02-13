package cars_park;

import cars.Car;

import java.lang.reflect.Array;
import java.util.ArrayList;


public interface CarPark {

    int calculateCost();

    ArrayList<Car> sortByFuelConsumption();

    ArrayList<Car> findCarBySpeedRange(int minSpeed, int maxSpeed);

}
