import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class HandWatchTest {
    HandWatch test = new HandWatch();
    @BeforeEach
    void init(){
        test.state = "Update";
    }
    @Test
    void checkInput() {
        assertEquals("Outer state is Normal and inner state is Time",test.checkInput('d'));
    }

    @Test
    void displayDate() {
        assertEquals("2001 - 1 - 1", test.DisplayDate());
    }

    @Test
    void displayTIME() {
        assertEquals("0 : 0", test.DisplayTIME());
    }
    @AfterEach
    void cleanUp(){
        test = null;
    }
}