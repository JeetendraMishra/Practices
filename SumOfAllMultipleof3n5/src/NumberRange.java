public class NumberRange {

    private int start;
    private int limit;

    public NumberRange(int start, int limit) {

        this.start = start;
        this.limit = limit;
    }

    public int sumOfMultiplesOf(int div1, int div2) {

        int sum = 0;
        for (int i = start; i < limit; i++) {

            if ((i % div1 == 0) || (i % div2 == 0)) {
                sum += i;
            }
        }
        return sum;

    }
}
