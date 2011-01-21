import org.junit.Test;
import static junit.framework.Assert.assertEquals;

public class SumOfAllMultiple3N5Test {

    @Test
    public void testSumOfMultiplesOf3And5(){
        assertEquals(233168, new NumberRange(1,1000).sumOfMultiplesOf(3, 5));
    }
}
