import java.text.DecimalFormat;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ProfitForecastLookup {
    private static final DecimalFormat MONEY = new DecimalFormat("#,##0.00");

    public static void main(String[] args) {
        Map<Integer, Double> profitMap = new TreeMap<>(Map.of(
            2023, 135_000.0,
            2024, 160_000.0,
            2025, 190_000.0,
            2026, 225_000.0,
            2027, 255_000.0,
            2028, 290_000.0
        ));

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter year to forecast: ");
            while (!scanner.hasNextInt()) {
                scanner.next();
                System.out.print("  ↳ please enter a valid year: ");
            }
            int year = scanner.nextInt();

            if (profitMap.containsKey(year)) {
                System.out.println("Projected profit for " + year + ": Rs. " +
                        MONEY.format(profitMap.get(year)));
            } else {
                System.out.println("No data for " + year + ".");
                System.out.println("Available years: " + profitMap.keySet());
            }
        }
    }
}
