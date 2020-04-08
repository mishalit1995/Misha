package home_work_9.object;

public class Accessory extends Object {
    private String type;

    public Accessory(int cost, String type) {
        super(cost);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Accessory{" +
                "type='" + type + '\'' +
                ", cost='" + getCost() +
                '}';
    }
}
