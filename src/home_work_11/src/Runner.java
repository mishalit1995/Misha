import cars.Car;
import cars_park.AutoPark;
import input_output.CarsInputOutput;
import input_output.FileInputOutput;

public class Runner {
    public static void main(String[] args) {

        CarsInputOutput carsInputOutput = new FileInputOutput("input.txt", "output.txt");

        Car[] readCars = carsInputOutput.readCars();

        AutoPark park = new AutoPark(readCars);

        carsInputOutput.writeCars(park.getCars());

    }
}
