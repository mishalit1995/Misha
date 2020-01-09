package HomeWork8.carsPark;

import HomeWork8.cars.Car;

public interface CarPark {

    int calculateCost(Car[] cars);

    Car [] sortByFuelConsumption(Car[] cars);

    Car[] findCarBySpeedRange(Car[] cars, int minSpeed, int maxSpeed);

    Car[] extendCarsArrayByNewCar(Car carToAdd, Car[] cars);
}
