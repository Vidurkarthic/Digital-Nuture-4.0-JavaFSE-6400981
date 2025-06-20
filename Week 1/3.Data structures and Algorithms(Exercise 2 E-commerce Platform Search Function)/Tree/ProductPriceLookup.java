
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ProductPriceLookup {
    public static void main(String[] args) {
        TreeMap<String, Double> productPrices = new TreeMap<>();
        productPrices.put("Electric Kettle", 1499.0);
        productPrices.put("Air Fryer", 7499.0);
        productPrices.put("Rice Cooker", 2799.0);
        productPrices.put("Toaster", 1899.0);
        productPrices.put("Induction Cooktop", 3499.0);

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter product name to search: ");
            String name = sc.nextLine().trim();

            if (productPrices.containsKey(name)) {
                System.out.println(name + " is available at Rs. " + productPrices.get(name));
            } else {
                System.out.println(name + " is not available.");
            }

            System.out.println("\nAll available products:");
            productPrices.forEach((p, price) ->
                    System.out.println("-> " + p + " : Rs. " + price));
        }
    }
}
