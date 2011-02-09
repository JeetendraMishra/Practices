import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class PrimeNumberTest {

    @Test
    public void testFindTerm(){

        assertEquals(5, new PrimeNumber().findTerm(3));
        assertEquals(104743, new PrimeNumber().findTerm(10001));
    }
}
