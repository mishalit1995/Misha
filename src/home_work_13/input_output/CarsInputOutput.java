package input_output;


import cars.Car;

import java.util.ArrayList;

public interface CarsInputOutput {

    ArrayList<Car> readFile();

    void putToFile(ArrayList<Car> cars);
}
