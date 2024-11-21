package product_catalog_management.sealed;

public abstract sealed class Product permits ElectronicsProduct {
    private final String name;
    private final double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String name() {
        return name;
    }

    public double price() {
        return price;
    }

    public abstract String category();
}
