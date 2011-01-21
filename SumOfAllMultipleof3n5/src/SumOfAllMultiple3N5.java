/**
 * Created by IntelliJ IDEA.
 * User: jeetendra
 * Date: 19 Jan, 2011
 * Time: 6:36:56 PM
 * To change this template use File | Settings | File Templates.
 */
public class SumOfAllMultiple3N5 {

    public int sumOfMultiple35(){

        int sum = 0;
        for(int i=1; i<1000; i++){

            if((i%3 == 0) || (i%5 == 0)){
                sum += i;
            }
        }
        return sum;

    }
}
