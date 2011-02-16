import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class NumberRange {

    int digits[];

    public NumberRange(int digits[]) {

        this.digits = digits;
    }

    public int findLargestProductofNConsecutiveDigit(int totalNumbers){

        Set<Integer> productSet = new HashSet<Integer>();

        // To extract product of consecutive digits from the Array

        for(int i=0; i<=(digits.length-totalNumbers); i++){
            
            int product = 1;

            for(int j=i; j<(i+totalNumbers); j++){
            
                    product *= digits[j];
            }

            productSet.add(product);
        }

        //To findout greatest product value

        Iterator itr = productSet.iterator();
        int largestProduct = 0;

        while(itr.hasNext()){

            int max = (Integer)itr.next();
            if(max>largestProduct){

                largestProduct = max;
            }

        }

        return largestProduct;
    }
}
