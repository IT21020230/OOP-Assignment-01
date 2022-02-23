
public class Calculation {

    //find Sum of the Series
    public int SumOfSeries(int start, int end, int incr) {
        int sum = 0;
        for (int i = start; i <= end; i += incr) {
            sum += i;
        }
        return sum;
    }

    //find Sum of the Array
    public int SumOfArray(int data[], int size) {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += data[i];
        }
        return sum;
    }

    //find Product of the Series
    public int ProductOfSeries(int start, int end, int incr) {
        int product = 1;
        for (int i = start; i <= end; i += incr) {
            product *= i;
        }
        return product;
    }

    //find Product of the Array
    public int ProductOfArray(int data[], int size) {
        int product = 1;
        for (int i = 0; i < size; i++) {
            product *= data[i];
        }
        return product;
    }

}
