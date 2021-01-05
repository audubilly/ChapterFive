import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ModifiedCompoundInterestTest {

    ModifiedCompoundInterest modifiedCompoundInterest;

    @BeforeEach
    void setUp() {
        modifiedCompoundInterest = new ModifiedCompoundInterest();
    }

    @AfterEach
    void tearDown() {
    }

//    @Test
//    void testThatTheRateCanBeGotten(){
////        when
//        double result = modifiedCompoundInterest.getRate();
//// assert
//        assertEquals(0.05, result);

//    }

    @Test
    void testThatAppCanCalculateCompoundInterestOfSingleRate() {
        //when
        double result = modifiedCompoundInterest.calculateCompoundInterestOfSingleYear(1000, 0.05, 1);
        //assert
        assertEquals(1050.0, result);
    }


    @Test
    void testThatAppCanCalculateTheCompoundInterest() {
        //when
        double result = modifiedCompoundInterest.calculateCompoundInterestForTenYears(1);
        //assert

        assertEquals(2046000.0, result);
    }


}
