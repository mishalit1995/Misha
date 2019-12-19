package HomeWork7;

public class AutoPark {

    private  Car [] cars;

    public AutoPark( Car [] cars) {
        this.cars = cars;
    }

    public Car[] getCars() {
        return cars;
    }

    public void setCars(Car[] cars) {
        this.cars = cars;
    }

    public int calculateCost() {
        int cost = 0;

        for(Car car : cars) {
            cost += car.getCost();
        }
        return cost;
    }

    public void  sortByFuelConsumption(){
        for (int i = 0; i < cars.length; i++) {
            for (int j = i + 1; j < cars.length; j++) {
                if (cars[j].getFuelConsumption() < cars[i].getFuelConsumption()) {
                    Car temp = cars[j];
                    cars[j] = cars[i];
                    cars[i] =  temp;
                }
            }
        }
    }

    public Car[] findCarBySpeedRange(int minSpeed, int maxSpeed) {
        Car[] res = {};

        for (Car car : getCars()) {
            if (car.getSpeed() >= minSpeed && car.getSpeed() <= maxSpeed) {
                res = extendCarsArrayByNewCar(car, res);
            }
        }

        return res;
    }

    private Car[] extendCarsArrayByNewCar(Car carToAdd, Car[] cars) {
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
    public String toString(){
        String result = " ";

        for (Car car : cars) {
            result += (car.toString() + "\n");
        }
        return result;
    }
}





