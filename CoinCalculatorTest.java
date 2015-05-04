package greedy;

import junit.framework.Assert;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class CoinCalculatorTest {

    /**test if BigDecimal method throws an exception when non-numeric is entered
     * if true than yes it throws an exception*/

    @Test(expected = NumberFormatException.class)
    public void testShouldThrowException() {

        BigDecimal bdChange = new BigDecimal("$33.33");

        assertEquals(true, bdChange);

    }

    @Test
    public void testShouldRoundTwoPlaces() {

      // test for accurate rounding;
        BigDecimal expected = new BigDecimal("1.00");
        BigDecimal bdChange = new BigDecimal(0.9959999);
        bdChange = bdChange.setScale(2, BigDecimal.ROUND_HALF_UP);

        assertEquals(expected, bdChange);

    }

}