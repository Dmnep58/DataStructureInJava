package leetcode75questions;


import java.util.Scanner;

/*
For two strings s and t, we say "t divides s" if and only if s = t + ... + t (i.e., t is
 concatenated with itself one or more times).

Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.
 */
public class GreatestCommonDivisorofStrings {

    private int gcd(int s1, int s2) {
        if(s2 == 0) return s1;
        return gcd(s2, s1%s2);
    }

    public String gcdOfStrings(String str1, String str2) {
        // since both are multiple of t'since
        // adding string str1 + str2 == str2 + str1
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        return str2.substring(0, gcd(str1.length(), str2.length()));
    }


    public static void main(String[] args) {

        GreatestCommonDivisorofStrings g = new GreatestCommonDivisorofStrings();

        String str1,str2;
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the first string");
        str1 = sc.next();
        System.out.println("enter the second string");
        str2 = sc.next();

        System.out.println(g.gcdOfStrings(str1,str2));

        sc.close();
    }
}
