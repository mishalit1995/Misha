package HomeWork8;

import HomeWork8.cars.*;
import HomeWork8.carsPark.AutoPark;

public class Runner {
    public static void main(String[] args) {
        Car[] park = new Car[]{
                new Bus(1, 25000, 90, 19,75),
                new Coupe(2,15030,130,15,4,"blue"),
                new Truck(3,18000, 110, 16,5,"black", 3000)
        };
        AutoPark carsPark = new AutoPark();

        Vehicle vehicle = new Vehicle();

        vehicle.printSorting(carsPark.sortByFuelConsumption(park));

        vehicle.printSpeed(carsPark.findCarBySpeedRange(park, 90, 110), 90, 100);

        vehicle.printCost(carsPark.calculateCost(park));
    }
}
