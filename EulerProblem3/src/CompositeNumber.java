import java.util.logging.Logger;

public class CompositeNumber {

    long compositNumber;

    public CompositeNumber(long compositNumber){

        this.compositNumber = compositNumber;
    }

    public CompositeNumber largestPrimeFactor(){

        if (compositNumber < 1){
            System.out.println("Input Number was Invalid, it must be greater then 0. ");
            return null;
        }

        long largestPrimeFactor = 1;
        int i = 2;

        while(i <= compositNumber){
            if(compositNumber % i == 0){
                compositNumber = compositNumber / i;
                largestPrimeFactor = i;
            }else{
                i++;
            }
        }

        return new CompositeNumber(largestPrimeFactor);
    }

    public long longValue(){
        return compositNumber;
    }
}
