import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmallestNumberTest {
    SmallestNumber smallestNumber;
    @BeforeEach
    void setUp() {
        smallestNumber = new SmallestNumber();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testThatTheSmallestNumberCanBeGottenFromSetOfNumbers(){
//    when
        int result = smallestNumber.getSmallestNumber();
//        assert
        System.out.println(result);
        assertEquals(12,result);

    }



}