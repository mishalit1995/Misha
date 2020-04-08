package home_work_9.object;

public class Flower extends Object {
    private String flower;
    private int freshness;
    private int length;

    public Flower(int cost, String flower, int freshness, int length) {
        super(cost);
        this.flower = flower;
        this.freshness = freshness;
        this.length = length;
    }

    public String getFlower() {
        return flower;
    }

    public int getFreshness() {
        return freshness;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "flower='" + flower + '\'' +
                ", freshness=" + freshness +
                ", length=" + length +
                ", price=" + getCost() +
                '}';
    }
}
