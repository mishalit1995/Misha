package input_output;


import cars.Car;

public interface CarsInputOutput {

    Car[] readCars();

    void writeCars(Car[] cars);
}
