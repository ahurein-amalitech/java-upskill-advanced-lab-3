package product_catalog_management.new_java_features;

public class Main {
    public static void main(String[] args) {
        System.out.println("Mango price: " + getPrice("mango"));
        ElectronicsProduct product = new ElectronicsProduct("Mouse", 5);
        System.out.println(product.description());
    }

    public static String getPrice(String productName) {
        return switch(productName){
            case "mango" -> "2.3";
            case "pineapple" -> "1.5";
            default -> "0";
        };
    }
}
