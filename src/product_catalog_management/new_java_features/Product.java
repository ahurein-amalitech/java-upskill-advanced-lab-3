package product_catalog_management.new_java_features;

public abstract sealed class Product permits ElectronicsProduct {
    private final String name;
    private final double price;
    private final String description;

    public Product(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public String name() {
        return name;
    }

    public double price() {
        return price;
    }

    public String description() {
        return description;
    }

    public abstract String category();
}

final class ElectronicsProduct extends Product {
    public ElectronicsProduct(String name, double price) {
        super(name, price, """
                
                This electronic product is state-of-the-art and designed
                for ultimate performance. It includes features like:
                - High-resolution display
                - Long battery life
                - Lightweight design
                
                """);
    }

    @Override
    public String category() {
        return "Electronics";
    }
}
