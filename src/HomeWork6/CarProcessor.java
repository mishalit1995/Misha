package HomeWork6;

public class CarProcessor {
    private Car[] array;

    public CarProcessor( Car[] array){
        this.array = array;
    }

    public CarProcessor(){
        array = new Car[]{};
    }

    void printCarsMark(String mark) {
        if (array.length != 0) {
            for (Car car : array) {
                if (car.mark.equals(mark)) {
                    printCar(car);
                }
            }
        }
    }

    void printCarsByModelWhichMoreThanYears(String model, int workingYears) {
        if (array.length != 0) {
            for (Car car : array) {
                if (car.model.equals(model) && car.workingYears() > workingYears) {
                    printCar1(car);
                }
            }
        }
    }

    void printCarsByProductYearWithMorePrise(int productionYear, int prise) {
        if (array.length != 0) {
            for (Car car : array) {
                if (car.productionYear == productionYear && car.prise > prise) {
                    printCar2(car);
                }
            }
        }
    }

    void printCarsMark(Car[] cars, String mark) {

        for (Car car : cars) {
            if (car.mark.equals(mark)) {
                printCar(car);
            }
        }
    }

    void printCarsByModelWhichMoreThanYears(Car[] cars, String model, int workingYears) {

        for (Car car : cars) {
            if (car.model.equals(model) && car.workingYears() > workingYears) {
                printCar1(car);
            }
        }

    }

    void printCarsByProductYearWithMorePrise(Car[] cars, int productionYear, int prise) {

        for (Car car : cars) {
            if (car.productionYear == productionYear && car.prise > prise) {
                printCar2(car);
            }
        }
    }

    void printCar(Car car) {

        System.out.print("\nCar Mark: " + car.mark + " " + car.model + ".");
    }
    void printCar1(Car car) {
        System.out.print("\nCars model: " + car.model + ", " + "operating more: " + car.workingYears() + " years." );
    }
    void printCar2(Car car) {
        System.out.print("\nCars by product with more: " + car.productionYear + " year, " + " prise: "  + car.prise + " $.");
    }
}