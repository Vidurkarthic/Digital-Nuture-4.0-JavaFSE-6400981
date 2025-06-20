import java.text.NumberFormat;
import java.util.Locale;
import java.util.Objects;

public class ProductItem {
    private final String name;
    private final double price;
    private static final NumberFormat INR =
            NumberFormat.getCurrencyInstance(new Locale("en", "IN"));

    public ProductItem(String name, double price) {
        this.name  = Objects.requireNonNull(name,  "name must not be null");
        this.price = price;
    }

    public String getName()  { return name;  }
    public double getPrice() { return price; }

    @Override
    public String toString() {
        return name + " – " + INR.format(price);
    }
}
