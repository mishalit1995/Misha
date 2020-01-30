package input_output;


import cars.Bus;
import cars.Car;
import cars.Coupe;
import cars.Truck;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringJoiner;

public class FileInputOutput implements CarsInputOutput {

    private String inputFile;
    private String outputFile;



    public FileInputOutput(String inputFile, String outputFile) {
        this.inputFile = inputFile;
        this.outputFile = outputFile;
    }

    public String getInputFile() {
        return inputFile;
    }

    public void setInputFile(String inputFile) {
        this.inputFile = inputFile;
    }

    public String getOutputFile() {
        return outputFile;
    }

    public void setOutputFile(String outputFile) {
        this.outputFile = outputFile;
    }

    public FileInputOutput(String fileName) {
        this(fileName, fileName);
    }

    public Car[] readCars() {
        Car[] cars = null;
        try (FileInputStream inputStream = new FileInputStream(inputFile)) {
            String fileContent = getFileFromByte(inputStream);
            String[] carLines = fileContent.split(";\r\n");
            System.out.println(Arrays.toString(carLines));
            cars = new Car[carLines.length];
            for (int i = 0; i < carLines.length; i++) {
                System.out.println();
                cars[i] = propertiesForArray(carLines[i].split(","));
            }
        } catch (IOException e) {
            System.err.println("Error reading file");
            e.printStackTrace();
        }
        return cars;
    }

    private String getFileFromByte(FileInputStream inputStream) throws IOException {
        byte[] fileBytes = new byte[inputStream.available()];
        inputStream.read(fileBytes);
        return new String(fileBytes);
    }

    public void writeCars(Car[] cars) {
        StringJoiner stringJoiner = new StringJoiner(";\r\n");
        for (Car car : cars) {
            stringJoiner.add(car.toOutput());
        }
        try (FileOutputStream outputStream = new FileOutputStream(outputFile)) {
            outputStream.write(stringJoiner.toString().getBytes());
        } catch (IOException e) {
            System.err.println("Error reading file");
            e.printStackTrace();
        }
    }

    private Car propertiesForArray(String[] carProperties) {
        Car car = null;
        String properties = carProperties[0];
        switch (properties) {
            case "Bus":
                car = new Bus(carProperties);
                break;
            case "Coupe":
                car = new Coupe(carProperties);
                break;
            case "Truck":
                car = new Truck(carProperties);
                break;
        }
        return car;
    }
}
