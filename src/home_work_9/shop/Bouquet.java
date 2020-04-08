package home_work_9.shop;

import home_work_9.Helper;
import home_work_9.object.Accessory;
import home_work_9.object.Flower;

public class Bouquet {
    private Flower[] flowers;
    private Accessory[] accessories;

    public Bouquet() {
        flowers = new Flower[0];
        accessories = new Accessory[0];

    }

    public Flower[] getFlowers() {
        return flowers;
    }

    public void setFlowers(Flower[] flowers) {
        this.flowers = flowers;
    }

    public Accessory[] getAccessories() {
        return accessories;
    }

    public void setAccessories(Accessory[] accessories) {
        this.accessories = accessories;
    }

    public void addFlowers(Flower flower) {
        flowers = Helper.increaseMassive(flower, flowers);
    }

    public void addAccessory(Accessory accessory) {
        accessories = Helper.increaseMassive(accessory, accessories);
    }

    public String toString() {
        String string = "";
        if (flowers.length != 0) {
            for (Flower flower : flowers) {
                string += "\nType: " + flower.getFlower() + ", prise: " + flower.getCost() + ", freshness: " +
                        flower.getFreshness() + ", leigth of stem: " + flower.getLength() + ".";

            }
        }
        if (accessories.length != 0) {
            for (Accessory accessory : accessories) {
                string += "\nType: " + accessory.getType() + ", prise: " + accessory.getCost() + ".";
            }
        }
        return string;
    }
}
