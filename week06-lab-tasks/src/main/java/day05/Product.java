package day05;

public class Product {

    private String name;
    private Type type;
    private Double price;

    public Product(String name, Type type, Double price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    public Double getPrice() {
        return price;
    }
}
