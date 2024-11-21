package product_catalog_management.records;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("Mouse", 45.2, "Electronics");

        System.out.println("Product Name: " + product.name());
        System.out.println("Product Price: $" + product.price());
        System.out.println("Product Category: " + product.category());
    }
}