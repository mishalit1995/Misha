package HomeWork8.carsPark;

import HomeWork8.cars.Car;

public class AutoPark implements CarPark {


   public int calculateCost(Car [] cars){
       int cost = 0;

       for(Car car : cars) {
           cost += car.getPrise();
       }
       return cost;
   }

    public Car [] sortByFuelConsumption(Car[] cars){
        for (int i = 0; i < cars.length; i++) {
            for (int j = i + 1; j < cars.length; j++) {
                if (cars[j].getFuelConsumption() < cars[i].getFuelConsumption()) {
                    Car temp = cars[j];
                    cars[j] = cars[i];
                    cars[i] =  temp;
                }
            }
        }
        return cars;
    }

    public Car[] findCarBySpeedRange(Car[] cars, int minSpeed, int maxSpeed) {
        Car[] res = {};

        for (Car car : cars) {
            if (car.getSpeed() >= minSpeed && car.getSpeed() <= maxSpeed) {
                res = extendCarsArrayByNewCar(car, res);
            }
        }

        return res;
    }

    public Car[] extendCarsArrayByNewCar(Car carToAdd, Car[] cars) {
        if (cars.length == 0) {
            return  new  Car[] {carToAdd};
        } else {
            Car[] newCarsArr = new Car[cars.length + 1];

            for (int i = 0; i < cars.length; i++) {
                newCarsArr[i] = cars[i];
            }

            newCarsArr[cars.length] = carToAdd;
            return  newCarsArr;
        }
    }
}
