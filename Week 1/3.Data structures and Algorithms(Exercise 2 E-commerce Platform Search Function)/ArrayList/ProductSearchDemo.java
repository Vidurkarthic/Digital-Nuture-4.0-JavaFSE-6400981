import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ProductSearchDemo {
    public static void main(String[] args) {
       List<String> products = Arrays.asList(
         "Yoga Mat",
         "Adjustable Dumbbells",
         "Resistance Bands",
         "Hiking Backpack",
         "Insulated Sports Water Jug"
        );
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter keyword to filter products: ");
            String keyword = scanner.nextLine().trim().toLowerCase();

            System.out.println("\nSearch results:");
            boolean anyMatch = products.stream()
                    .filter(p -> p.toLowerCase().contains(keyword))
                    .peek(p -> System.out.println("->" + p)) 
                    .findAny()                              
                    .isPresent();

            if (!anyMatch) {
                System.out.println("No matching products found.");
            }
        } 
    }
}
