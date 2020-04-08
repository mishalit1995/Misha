package home_work_9.shop;

import home_work_9.Helper;
import home_work_9.NegativeParams;
import home_work_9.object.Accessory;
import home_work_9.object.Flower;

public class FlowerShop {
    private Bouquet[] bouquets;

    public FlowerShop() {
        this.bouquets = new Bouquet[0];
    }

    public Bouquet[] getBouquets() {
        return bouquets;
    }

    public void addBouquet(Bouquet bouquet) {
        bouquets = Helper.increaseMassive(bouquet, bouquets);
    }

    public void addFlowerToBouquet(Bouquet existingBouquet, Flower flower) {
        existingBouquet.addFlowers(flower);
    }

    public void addAccessoryToBouquet(Bouquet existingBouquet, Accessory accessory) {
        existingBouquet.addAccessory(accessory);
    }

    public Bouquet sortByFreshness(Bouquet bouquet) {
        Flower[] flowers = bouquet.getFlowers();
        for (int i = flowers.length - 1; i > 0; i++) {
            for (int j = 0; j < i; j++) {
                if (flowers[i].getFreshness() > flowers[j + 1].getFreshness()) {
                    Flower tenporal = flowers[j];
                    flowers[j] = flowers[j + 1];
                    flowers[j + 1] = tenporal;
                }
            }
        }
        bouquet.setFlowers(flowers);
        return bouquet;
    }

    public int calculateCost(Bouquet bouquet) {
        Flower[] flowers = bouquet.getFlowers();
        Accessory[] accessories = bouquet.getAccessories();
        int cost = 0;
        for (Flower flower : flowers) {
            cost += flower.getCost();
        }
        for (Accessory accessory : accessories) {
            cost += accessory.getCost();
        }
        return cost;
    }

    public Flower[] findByStem(Bouquet bouquet, int minStem, int maxStem) {
        if (minStem < 0 || maxStem < 0) {
            try {
                throw new NegativeParams();
            } catch (NegativeParams negativeParams) {
                System.out.println("You sent negative numbers!");
            }
        } else {
            Flower[] flowers = bouquet.getFlowers();
            Flower[] result = new Flower[0];
            for (Flower flower : flowers) {
                if (flower.getLength() >= minStem && flower.getLength() <= maxStem) {
                    result = Helper.increaseMassive(flower, flowers);
                }
            }
            return result;
        }
        return null;
    }
}


