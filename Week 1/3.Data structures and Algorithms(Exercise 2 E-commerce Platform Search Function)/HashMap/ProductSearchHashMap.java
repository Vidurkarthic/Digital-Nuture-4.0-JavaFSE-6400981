package HashMap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ProductSearchHashMap {
    public static void main(String[] args) {
        Map<Integer, String> productMap = new LinkedHashMap<>();
        productMap.put(201, "Wireless Charger");
        productMap.put(202, "Bluetooth Earbuds");
        productMap.put(203, "Phone Stand");
        productMap.put(204, "USB‑C Cable");
        productMap.put(205, "Power Bank");
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter product ID to search: ");
            int productId = sc.nextInt();

            if (productMap.containsKey(productId)) {
                System.out.println("Product Found: " + productMap.get(productId));
            } else {
                System.out.println("Product ID not found.");
                System.out.println("Available items:");
                productMap.forEach((id, name) -> System.out.println("• " + id + " → " + name));
            }
        }
    }
}
