import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class PrimeNumberTest {

    @Test
    public void shouldSum(){

        assertEquals(100, new PrimeNumber(24).findSum());
        assertEquals(142913828922l, new PrimeNumber(2000000).findSum());
    }
}
