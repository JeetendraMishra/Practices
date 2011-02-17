public class PythagoreanTriplet {

    int sumOfPythagoreanTriplet;

    PythagoreanTriplet(int sumOfPythagoreanTriplet){

            this.sumOfPythagoreanTriplet = sumOfPythagoreanTriplet;
    }

    public int productOfPythagoreanTriplet(){

        int productOfNumbers = 0;

        for(int a=1; a<sumOfPythagoreanTriplet; a++){

            int squareOfFirstTrplet = a*a;

            for(int b=1; b<sumOfPythagoreanTriplet; b++){

                int squareOfSecondTrplet = b*b;

                for(int c=1; c<sumOfPythagoreanTriplet; c++){

                    int squareOfThirdTrplet = c*c;
                    int sumOfTriplet = a+b+c;
                    if((squareOfFirstTrplet+squareOfSecondTrplet == squareOfThirdTrplet) && (sumOfTriplet == sumOfPythagoreanTriplet)){

                        productOfNumbers = a*b*c;
                    }
                }
            }
        }

        return productOfNumbers;
    }
}
