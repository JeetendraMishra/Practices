public class PrimeNumber {

    long limit;

    public PrimeNumber(long limit) {

        this.limit = limit;
    }

    public long findSum(){

        if(limit < 3){

            return 0;
        }

        long sum = 0;

        for(long i=2; i<limit; i++){

            if(isPrime(i)){

                sum += i;
            }
        }
        return sum;
    }

    private boolean isPrime(long number){

        for(long i=2; i<=(number/2); i++){

            if(number%i == 0){

                return false;
            }
        }
        return true;
    }
}
