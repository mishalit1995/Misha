package cars_park;

import cars.Car;


import java.util.List;


public interface CarPark {

    int calculateCost();

    List<Car> sortByFuelConsumption();

    List<Car> findCarBySpeedRange(int minSpeed, int maxSpeed);

}
