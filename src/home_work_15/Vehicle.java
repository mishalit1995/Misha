import cars.Car;


import java.util.List;

public class Vehicle {
    public void printSorting(List<Car> list) {
        for (Car car : list) {
            System.out.println("Vehicle " + car.getId() + ", fuel consumption: " + car.getFuelConsumption());
        }
    }

    public void printSpeed(List<Car> list, int min, int max) {
        System.out.println("\nCars speed between " + min + " and " + max + ":");
        for (Car car : list) {
            System.out.println(car);
        }
    }

    public void printCost(int sum) {
        System.out.println("\nCost carpark: " + sum + "$");
    }
}
