import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class NotificationService {

    public interface Notifier {
        void send(String message);
    }

    @Test
    void testNotifierCalledTwice() {
        Notifier mockNotifier = mock(Notifier.class);

        mockNotifier.send("Welcome!");
        mockNotifier.send("Thanks!");

        verify(mockNotifier, times(2)).send(anyString());
    }
}
