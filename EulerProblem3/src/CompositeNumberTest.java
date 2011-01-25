import org.junit.Test;
import static junit.framework.Assert.assertEquals;

public class CompositeNumberTest {

    @Test
    public void testGetLargestPrimeFactor(){
        assertEquals(2, new CompositeNumber(2).largestPrimeFactor().longValue());
        assertEquals(1, new CompositeNumber(1).largestPrimeFactor().longValue());
        assertEquals(6857, new CompositeNumber(600851475143L).largestPrimeFactor().longValue());
    }
}
