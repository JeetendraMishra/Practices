import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class NumberRangeTest {

     @Test
     public void testDifferenceOfSquareOfSumsAndSumOfSquares(){
         
        assertEquals(25164150, new NumberRange(1,100).differenceOfSquareOfSumsAndSumOfSquares());
     }
}
