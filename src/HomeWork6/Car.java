package HomeWork6;

public class Car {
    int id;
    String mark;
    String model;
    int productionYear;
    String color;
    int prise;
    int registrationNumber;

    public Car (int id, String mark,String model, int productionYear, String color, int prise, int registrationNumber) {
        this.id = id;
        this.mark = mark;
        this.model = model;
        this.productionYear = productionYear;
        this.color = color;
        this.prise = prise;
        this.registrationNumber = registrationNumber;
    }
    public int workingYears(){
        return (2019 - productionYear);
    }
}

