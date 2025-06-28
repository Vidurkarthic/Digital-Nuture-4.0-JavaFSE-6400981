import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TextComparisonTest {

    @Test
    void checkExactMatch() {
        String result = "OpenAI";
        String expected = "OpenAI";
        assertEquals(expected, result); // Case-sensitive match
    }

    @Test
    void checkCaseInsensitiveMatch() {
        String userName = "vidur";
        assertTrue(userName.equalsIgnoreCase("VIDUR")); // Ignores case
    }
}
