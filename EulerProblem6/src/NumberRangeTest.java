import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class NumberRangeTest {

     @Test
     public void testCheckTheDifference(){
        assertEquals(25164150, new NumberRange(1,100).differenceOfSquareOfSumsAndSumOfSquares());
     }
}
