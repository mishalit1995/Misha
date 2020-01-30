package cars_park;

import cars.Car;

public interface CarPark {

    int calculateCost(Car[] cars);

    Car [] sortByFuelConsumption(Car[] cars);

    Car[] findCarBySpeedRange(Car[] cars, int minSpeed, int maxSpeed);

    Car[] extendCarsArrayByNewCar(Car carToAdd, Car[] cars);

}
