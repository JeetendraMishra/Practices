import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class PythagoreanTripletTest {

    @Test
    public void shouldProductOfPythagoreanTriplet(){

               assertEquals(31875000, new PythagoreanTriplet(1000).productOfPythagoreanTriplet());
    }
}
