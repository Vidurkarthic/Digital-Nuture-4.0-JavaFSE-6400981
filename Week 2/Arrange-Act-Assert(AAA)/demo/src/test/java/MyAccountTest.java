import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class MyAccountTest {

    MyAccount myAcc;

    @BeforeEach
    void initializeAccount() {
        myAcc = new MyAccount(); // Setup phase
    }

    @Test
    void testAddingFunds() {
        myAcc.addFunds(1000);    // Action
        assertEquals(1000, myAcc.checkBalance()); // Verification
    }

    @Test
    void testRemovingFunds() {
        myAcc.addFunds(500);
        myAcc.removeFunds(200);
        assertEquals(300, myAcc.checkBalance());
    }

    @AfterEach
    void endOfTest() {
        System.out.println("Test case executed.");
    }
}
