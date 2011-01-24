public class SumOfEvenTermsOfFibonacciNumbersStartFrom {

    int FirstNumber;
    int SecondNumber;

    SumOfEvenTermsOfFibonacciNumbersStartFrom(int FirstNumber, int SecondNumber){

      this.FirstNumber = FirstNumber;
      this.SecondNumber = SecondNumber;

    }

    public int sumOfEvenTermsOfFibonacciNumbersUpTo(int fibonacciTermsUpTo){

        int sumOfEvenTermsOfFibonacciTerms = 0;

        if(FirstNumber%2 == 0){
            sumOfEvenTermsOfFibonacciTerms += FirstNumber;
        }

        int Temp;

        while(SecondNumber <= fibonacciTermsUpTo){

            if(SecondNumber%2 == 0){
                sumOfEvenTermsOfFibonacciTerms += SecondNumber;
            }

            Temp = FirstNumber;
            FirstNumber = SecondNumber;
            SecondNumber += Temp;
        }

        return sumOfEvenTermsOfFibonacciTerms;

    }
}