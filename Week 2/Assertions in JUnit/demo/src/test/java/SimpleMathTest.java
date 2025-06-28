import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SimpleMathTest {

    @Test
    void shouldBePositive() {
        int value = 10;
        assertTrue(value > 0); // Ensures the number is greater than zero
    }

    @Test
    void valuesAreDifferent() {
        int first = 10;
        int second = 20;
        assertNotEquals(first, second); // Verifies inequality
    }
}
