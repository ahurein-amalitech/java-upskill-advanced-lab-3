package product_catalog_management.sealed;

public final class ElectronicsProduct extends Product {
    public ElectronicsProduct(String name, double price) {
        super(name, price);
    }

    @Override
    public String category() {
        return "Electronics";
    }
}