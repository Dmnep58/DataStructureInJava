package Array;

import java.util.Scanner;

public class PerfectSquare {

    public int FindSqrt(int n){
        if(n == 1)
            return n;

        double start=0;
        double end= n/2;

        do{
            start = end;

            end = (start + (n/start))/2;

        }
        while(start - end !=0);

        return (int)end;
    }

    public boolean IsValidPerfectSquare(int n){

        int sqr = FindSqrt(n);

        if(sqr * sqr == n){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        PerfectSquare ps = new PerfectSquare();
        int x ;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        x= sc.nextInt();

       boolean t =  ps.IsValidPerfectSquare(x);
        System.out.println(t);

        sc.close();
    }
}
