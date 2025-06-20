import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MonthlyProfitDisplay {

    private static final DecimalFormat MONEY = new DecimalFormat("#,##0.00");

    public static void main(String[] args) {
        List<Double> projections = new ArrayList<>(6);

        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Projected profit for the next six months");
            for (int month = 1; month <= 6; month++) {
                System.out.print("Month-" + month + " : Rs. ");
                while (!in.hasNextDouble()) {
                    in.next();
                    System.out.print("  -> enter a valid number: ");
                }
                projections.add(in.nextDouble());
            }
        }

        double total = projections.stream().mapToDouble(Double::doubleValue).sum();
        double average = total / projections.size();

        System.out.println("\n----------- Monthly Report -----------");
        for (int i = 0; i < projections.size(); i++) {
            System.out.printf("Month-%d : Rs. %s%n", i + 1, MONEY.format(projections.get(i)));
        }
        System.out.println("--------------------------------------");
        System.out.println("Total    : Rs. " + MONEY.format(total));
        System.out.println("Average  : Rs. " + MONEY.format(average));
    }
}
