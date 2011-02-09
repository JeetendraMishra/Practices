public class PrimeNumber {

    public int findTerm(int term){

        int count = 0;
        int number = 2;

        while(number > 1){

            if(isPrime(number)){

                count++;
                if(count == term){

                    return number;
                }else{

                    number++;
                }
            }else{
                
                number++;
            }
        }

        return 0;
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
