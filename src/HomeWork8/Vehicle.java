package HomeWork8;

import HomeWork8.cars.Car;

public class Vehicle {
    public void printSorting(Car[] array) {
        for (Car car : array) {
            System.out.println("Vehicle " + car.getId() + ", fuel consumption: " + car.getFuelConsumption());
        }
    }

    public void printSpeed(Car[] array, int min, int max) {
        System.out.println("\nCars speed between " + min + " and " + max + ":");
        for (Car car : array) {
            System.out.println(car);
        }
    }

    public void printCost(int sum) {
        System.out.println("\nCost carpark: " + sum + "$");
    }
}
