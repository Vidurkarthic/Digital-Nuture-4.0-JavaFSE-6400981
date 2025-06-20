import java.text.NumberFormat;
import java.util.*;

public class ProductSearchDemo {
    public static void main(String[] args) {
        List<ProductItem> catalog = new ArrayList<>(List.of(
            new ProductItem("Wireless Charger", 1999),
            new ProductItem("Bluetooth Earbuds", 3499),
            new ProductItem("Phone Stand", 499),
            new ProductItem("Screen Protector", 299),
            new ProductItem("USB-C Cable", 699)
        ));

        Comparator<ProductItem> BY_NAME =
                Comparator.comparing(ProductItem::getName, String.CASE_INSENSITIVE_ORDER);
        catalog.sort(BY_NAME);
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter product name to search: ");
            String needle = scanner.nextLine().trim();

            int idx = Collections.binarySearch(catalog, new ProductItem(needle, 0), BY_NAME);

            System.out.println(); 

            if (idx >= 0) {
                System.out.println("✔ Found: " + catalog.get(idx));
            } else {
                System.out.println("✖ Product not found.");
                System.out.println("Available items:");
                catalog.forEach(p -> System.out.println("• " + p));
            }
        }
    }
}
