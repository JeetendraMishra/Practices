import org.junit.Test;
import static junit.framework.Assert.assertEquals;

/**
 * Created by IntelliJ IDEA.
 * User: jeetendra
 * Date: 19 Jan, 2011
 * Time: 6:37:44 PM
 * To change this template use File | Settings | File Templates.
 */

public class SumOfAllMultiple3N5Test {

    @Test
    public void testSumOfMultiple35(){

        SumOfAllMultiple3N5 sumOfAllMultiple3N5;
        sumOfAllMultiple3N5 = new SumOfAllMultiple3N5();

        int sum = sumOfAllMultiple3N5.sumOfMultiple35();

        System.out.println("sum :" +sum);

        assertEquals(233168, sum);

    }
}
