package HomeWork7;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        Car[] cars = {
                new PassengerCar("Toyota", "gasoline", 12, 140, 15000, "sedan"),
                new Bus("Tata", "Diesel", 18, 110, 35000, 87),
                new PassengerCar("Nissan", "gasoline", 11, 135, 17650, "coupe"),
                new Bus("Volvo", "Diesel", 23, 125, 58000, 150)
        };

        AutoPark ap = new AutoPark(cars);
        System.out.println(ap.calculateCost());
        System.out.println();

        System.out.println(ap);
        System.out.println();

        ap.sortByFuelConsumption();
        System.out.println(ap);

        System.out.println(Arrays.toString(ap.findCarBySpeedRange(100, 130)));

    }
}


