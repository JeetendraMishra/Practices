public class NumberRange {

    int start;
    int limit;
    NumberRange(int start, int limit){

        this.start = start;
        this.limit = limit;
    }

    public int differenceOfSquareOfSumsAndSumOfSquares(){

       int sumOfSquares = 0;
       int squareOfSums = 0;

       for(int i=start; i<=limit; i++){

           squareOfSums += i;
           sumOfSquares += (i*i);
       }

       return ((squareOfSums*squareOfSums)-sumOfSquares);
    }
}
