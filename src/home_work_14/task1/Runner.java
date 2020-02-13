import cars.Car;

import cars_park.AutoPark;
import input_output.CarsInputOutput;
import input_output.FileInputOutput;

import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {

        CarsInputOutput fileInputOutput = new FileInputOutput();

        ArrayList<Car> cars = fileInputOutput.readFile();

        AutoPark park = new AutoPark();

        park.sortByFuelConsumption();

    }
}
