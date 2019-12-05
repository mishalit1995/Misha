package HomeWork5;

public class Runner {
    public static void main(String[] args) {
        Car[] cars = {
                new Car (1, "Toyota", "Corolla", 2015 , "blue", 25000, 1354),
                new Car (5, "Toyota", "Camry",2011, "yelow", 33000, 2033),
                new Car (2, "KIA", "Ceed", 2011, "black", 15300, 8925),
                new Car (2, "KIA", "Rio", 2010, "gray", 7000, 1322),
                new Car (2, "KIA", "Cerato", 2005, "white", 5050, 1672),
                new Car (2, "KIA", "Rio Old", 2000, "black", 3500, 1892),
                new Car (2, "Nissan", "Maxima", 2006, "gray", 7300, 1452)
        };
        CarProcessor proc = new CarProcessor();

        proc.printCarsMark(cars, "Nissan");

        proc.printCarsByModelWhichMoreThanYears(cars, "Rio", 3);

        proc.printCarsByModelWhichMoreThanYears(cars, "Camry", 3);

        proc.printCarsByProductYearWithMorePrise(cars, 2011, 5000);
    }

}
