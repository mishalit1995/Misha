package input_output;


import cars.Bus;
import cars.Car;
import cars.Coupe;
import cars.Truck;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;


public class FileInputOutput implements CarsInputOutput {

    private File inputFile = new File("src/files/InputCars.txt");
    private File outputFile = new File("src/files/OutputCars.txt");


    public ArrayList<Car> readFile() {
        String string = "";
        if (inputFile.isFile()) {
            try (FileInputStream fileInputStream = new FileInputStream(inputFile)) {
                byte[] bytes = new byte[fileInputStream.available()];
                fileInputStream.read(bytes, 0, fileInputStream.available());

                for (int i = 0; i < bytes.length; i++) {
                    string += (char) bytes[i];
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return getFileFromByte(string);
    }

    public void putToFile(ArrayList<Car> cars) {
        if (outputFile.isFile()) {
            try (FileOutputStream fileOutputStream = new FileOutputStream(outputFile, false)) {
                for (Car car : cars) {
                    fileOutputStream.write(car.toOutput());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private ArrayList<Car> getFileFromByte(String string) {
        ArrayList<Car> cars = new ArrayList<>();
        for (String car : string.split(";\\r\\n")) {
            String[] carProperties = car.split(", ");
            switch (carProperties[0]) {
                case "Bus":
                    cars.add(new Bus(Integer.parseInt(carProperties[1]), Integer.parseInt(carProperties[2]),
                            Integer.parseInt(carProperties[3]), Integer.parseInt(carProperties[4]),
                            Integer.parseInt(carProperties[5])));
                    break;
                case "Coupe":
                    cars.add(new Coupe(Integer.parseInt(carProperties[1]), Integer.parseInt(carProperties[2]),
                            Integer.parseInt(carProperties[3]), Integer.parseInt(carProperties[4]),
                            Integer.parseInt(carProperties[5]), carProperties[6]));
                    break;
                case "Truck":
                    cars.add(new Truck(Integer.parseInt(carProperties[1]), Integer.parseInt(carProperties[2]),
                            Integer.parseInt(carProperties[3]), Integer.parseInt(carProperties[4]),
                            Integer.parseInt(carProperties[5]), carProperties[6],
                            Integer.parseInt(carProperties[7])));
            }
        }
        return cars;
    }

}
