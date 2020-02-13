package cars_park;


import cars.Car;
import input_output.FileInputOutput;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class AutoPark implements CarPark {

    public ArrayList<Car> cars;
    private FileInputOutput inputOutput = new FileInputOutput();

    public AutoPark() {
        this.cars = inputOutput.readFile();
    }

    private Comparator<Car> fuelComparator = new Comparator<Car>() {
        @Override
        public int compare(Car o1, Car o2) {
            return o1.getFuelConsumption() - o2.getFuelConsumption();
        }
    };

    private Comparator<Car> lambdaComparator = ((o1, o2) -> o1.getFuelConsumption() - o2.getFuelConsumption());

    private int copareFuel(Car o1, Car o2) {
        return o1.getFuelConsumption() - o2.getFuelConsumption();
    }


    public ArrayList<Car> sortByFuelConsumption() {
        Collections.sort(cars, fuelComparator);
        Collections.sort(cars, lambdaComparator);
        Collections.sort(cars, Car::compare);
        Collections.sort(cars, this::copareFuel);
        inputOutput.putToFile(cars);
        return cars;
    }

    public ArrayList<Car> findCarBySpeedRange(int minSpeed, int maxSpeed) {
        ArrayList<Car> list = new ArrayList<>();

        for (Car car : cars) {
            if (car.getSpeed() >= minSpeed && car.getSpeed() <= maxSpeed) {
                list.add(car);
            }
        }

        return list;
    }

    public int calculateCost() {
        int cost = 0;

        for (Car car : cars) {
            cost += car.getPrise();
        }
        return cost;
    }

}
