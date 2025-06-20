package search;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LinearSearchDemo {
    public static void main(String[] args) {
        List<String> products = Arrays.asList(
            "Notebook",
            "Gel Pen",
            "Stapler",
            "Desk Organizer",
            "Sticky Notes"
        );

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter product to search: ");
            String searchItem = sc.nextLine().trim();

            boolean found = products.stream()
                                    .anyMatch(p -> p.equalsIgnoreCase(searchItem));

            System.out.println();
            if (found) {
                System.out.println("-> " + searchItem + " is available in the store.");
            } else {
                System.out.println("X " + searchItem + " is not available.");
                System.out.println("Available items:");
                products.forEach(p -> System.out.println("• " + p));
            }
        }
    }
}
