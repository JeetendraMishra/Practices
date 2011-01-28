public class Palindrome {

    int minimumLimit;
    int maximumLimit;

    Palindrome(int minimumLimit , int maximumLimit){
        this.minimumLimit = minimumLimit;
        this.maximumLimit = maximumLimit;
    }

     public int getLargestPalindrome(){

         int product = 0;
         int largestPalindromeNumber = 0;
             for(int i=maximumLimit; i>= minimumLimit; i--){
                 
              for(int j = maximumLimit ; j >= minimumLimit; j--){
                    product = i*j;

                    if(isPalindrome(product)){

                        if(largestPalindromeNumber < product){
                             largestPalindromeNumber = product;
                        }
                    }
              }
             }
            return largestPalindromeNumber;
     }

    boolean isPalindrome(int product) {

        StringBuffer palindrome = new StringBuffer(String.valueOf(product));
        StringBuffer reversePalindrome = new StringBuffer(String.valueOf(product));
        return ((palindrome.toString()).equals(reversePalindrome.reverse().toString()));
    }
}
