package Array;

/*
Given a list of N fractions, represented as two lists numerator and denominator,
the task is to determine the count of pairs of fractions whose sum equals 1.


Example 1:

Input:
N = 4
numerator = [1, 2, 2, 8]
denominator = [2, 4, 6, 12]
Output:
2
Explanation:
Fractions 1/2 and 2/4 sum to 1. Similarly, fractions 2/6 and 8/12 sum to 1. So there are 2 pairs of fractions which sum to 1.

 */


import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class FractionSum1 {


        static class Fraction{
            private int numerator;
            private int denominator;
            private int hashCode;
            public Fraction(int numerator,int denominator){
                this.numerator = numerator;
                this.denominator = denominator;
                this.hashCode = Objects.hash(numerator,denominator);
            }
            @Override
            public boolean equals(Object o) {
                if (this == o)
                    return true;
                if (o == null || getClass() != o.getClass())
                    return false;
                Fraction that = (Fraction) o;
                return numerator == that.numerator && denominator == that.denominator;
            }

            @Override
            public int hashCode() {
                return this.hashCode;
            }
        }
        public static int countFractions(int n, int[] numerator, int[] denominator) {
            Map<Fraction,Integer> seen = new HashMap<>();
            int countOfFractionsWhoseSumToOne = 0;
            for(int i = 0; i < n; i++){
                int x = numerator[i],y = denominator[i];
                int gcd = findGCD(x,y);
                x/=gcd;
                y/=gcd;
                Fraction curr = new Fraction(x,y);
                Fraction required = new Fraction(y-x,y);
                countOfFractionsWhoseSumToOne+=seen.getOrDefault(required,0);
                seen.put(curr,seen.getOrDefault(curr,0)+1);
            }
            return countOfFractionsWhoseSumToOne;
        }
        private static int findGCD(int a,int b){
            if(b == 0){
                return a;
            }
            else{
                return findGCD(b,a%b);
            }
        }
    }


