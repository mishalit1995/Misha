package cars_park;


import cars.Car;
import input_output.FileInputOutput;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AutoPark implements CarPark {

    public List<Car> cars;
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


    public List<Car> sortByFuelConsumption() {
        setCars(cars.stream().sorted(Comparator.comparingInt(Car::getFuelConsumption)).collect(Collectors.toList()));
        inputOutput.putToFile(cars);
        return cars;
    }

    public List<Car> findCarBySpeedRange(int minSpeed, int maxSpeed) {
       cars = cars.stream().filter(car -> (car.getSpeed() >= minSpeed && car.getSpeed() <= maxSpeed))
               .collect(Collectors.toList());
       return cars;
    }

    public int calculateCost() {
       return cars.stream().reduce(0,(c1 ,c2) -> {
           return c1 + c2.getPrise();
           }, (c1, c2) -> c1 + c2);
    }

    @Override
    public String toString() {
        return cars.stream().map(c -> c.toString()).collect(Collectors.joining("\n"));

    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }
}
