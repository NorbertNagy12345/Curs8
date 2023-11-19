package Exercise1;

public class Cosmetics extends Product {
    private String color;
    private double weight;

    public Cosmetics(int price, String name, String description, int quantity, String color, double weight) {
        super(price, name, description, quantity);
        this.color = color;
        this.weight = weight;
    }
}
