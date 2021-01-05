import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfOddNumbersTest {

    SumOfOddNumbers sumOfOddNumbers;
    @BeforeEach
    void setUp() {

    }

    @AfterEach
    void tearDown() {
    }


    @Test
    void testThatAppCanCalculateTheProductOfTheSetOfOddNumbers(){
    //given
    SumOfOddNumbers sumOfOddNumbers = new SumOfOddNumbers();
//        when
        int result =  sumOfOddNumbers.calculateProduct();
        // assert
        System.out.println(result);
        assertEquals(2027025,result );
    }
}