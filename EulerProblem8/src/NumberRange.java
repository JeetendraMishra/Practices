import java.util.HashSet;
import java.util.Set;

public class NumberRange {

    int digits[];

    public NumberRange(int digits[]) {

        this.digits = digits;
    }

    public int findLargestProductofNConsecutiveDigit(int totalNumbers){

        // To find out largest product of N consecutive digits from the Array

        Set<Integer> productSet = new HashSet<Integer>();
        int largestProduct = 0;

        for(int i=0; i<=(digits.length-totalNumbers); i++){
            
            int product = 1;

            for(int j=i; j<(i+totalNumbers); j++){
            
                    product *= digits[j];
            }

            if(product > largestProduct){

                largestProduct = product;
            }
        }

        return largestProduct;
    }
}
