import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class SmallestNumberTest {

    @Test
    public void testDivisibelByRange(){

        assertEquals(2520, new SmallestNumber().divisibelByRange(1,10));
        assertEquals(232792560, new SmallestNumber().divisibelByRange(1,20));
    }
}
