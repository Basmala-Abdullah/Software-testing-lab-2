import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question1Test {
    Question1 qtest = new Question1();
    @BeforeEach
    void init(){
        qtest.initnum(6);
        int arr[]={1,2,3,4,5};
        qtest.initarr(arr);
    }
    @Test
    void checkResult() {

        assertEquals("Number is Even",qtest.checkEvenOrOdd());
        assertEquals("Max is 5 and Min is 1",qtest.FindMaxAndMin());
    }
    @AfterEach
    void cleanUp(){
        qtest = null;
    }
}