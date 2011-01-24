import org.junit.Test;
import static junit.framework.Assert.assertEquals;

public class SumOfEvenTermsOfFibonacciNumbersTest {

    @Test
    public void SumOfEvenTermsOfFibonacciNumbersStartFromTest(){

        assertEquals(4613732, new SumOfEvenTermsOfFibonacciNumbersStartFrom(1,2).sumOfEvenTermsOfFibonacciNumbersUpTo(4000000));
        
    }
}
