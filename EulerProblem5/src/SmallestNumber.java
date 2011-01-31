import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SmallestNumber {


    public int divisibelByRange(int startLimit, int endLimit){

        int lastLimit = endLimit;
        Set<Integer> primeNumber = new HashSet<Integer>();

        for(int number = startLimit; number<=endLimit; number++){

            boolean result = isPrime(number);

            if(result == true){
                primeNumber.add(number);
            }
        }

        boolean loop = true;

        while(loop){
            int initialValue = endLimit;
            Iterator itr = primeNumber.iterator();

            while(itr.hasNext()){

                Object element = itr.next();
                int intElement = (Integer)element;
                if(endLimit%intElement != 0){
                    endLimit++;
                    break;
                }
            }

            if(endLimit == initialValue){
                loop = false;
            }

            if(lastLimit >= 4 && endLimit%4 != 0){
                endLimit++;
                loop = true;
            }else if(lastLimit >= 8 && endLimit%8 != 0){
                endLimit++;
                loop = true;
            }else if(lastLimit >= 9 && endLimit%9 != 0){
                endLimit++;
                loop = true;
            }else if(lastLimit >= 16 && endLimit%16 != 0){
                endLimit++;
                loop = true;
            }
        }

        return endLimit;
    }

    private boolean isPrime(int number) {

        for(int i=2; i<=(number/2); i++){

            if(number%i == 0){
                return false;
            }
        }
        return true;
    }
}
