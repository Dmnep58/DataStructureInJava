package Array;
/*
calculate the square root of the given integer
 */
public class SquareRoot {
    public double numbersqrt(int n){

        double start=0;

        double end = n/2;//store the half value of the real number

        do {
            start = end; //assign the half value to start

            end = (start + (n / start))/2; //calculate the end value which is half of the number in a loop
        }
        while (start-end!=0); // if start - end is less than terminate

        return end;//now end has the exact sqrt value of that number
    }

    public static void main(String[] args) {
        SquareRoot sq = new SquareRoot();
        double a = sq.numbersqrt(238);
        System.out.println(a);
    }
}
