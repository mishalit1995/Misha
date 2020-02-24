package input_output;


import cars.Car;

import java.util.ArrayList;
import java.util.List;

public interface CarsInputOutput {

    List<Car> readFile();

    void putToFile(List<Car> cars);
}
