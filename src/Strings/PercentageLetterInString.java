package Strings;

import java.util.Scanner;

/*
Given a string s and a character letter, return the percentage of characters in s that equal letter rounded down
to the nearest whole percent.

Example :

Input: s = "foobar", letter = "o"
Output: 33
Explanation:
The percentage of characters in s that equal the letter 'o' is 2 / 6 * 100% = 33% when rounded down, so we return 33.
 */
public class PercentageLetterInString {
    public int percentageLetter(String s, char letter) {
        int per;
        int count = 0;
        int n = s.length();

        for(int i=0; i<n; i++){
            char a =s.charAt(i);
            if( a == letter){
                count++;
                System.out.println(count);
            }
        }

        System.out.println(s.length());

        per = (count *100) / n;
        System.out.println(per);

        return per;
    }

    public static void main(String[] args) {
        PercentageLetterInString pr = new PercentageLetterInString();

        String s;
        char l;

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the string");
        s= sc.next();

        System.out.println("enter the letter");
        l= sc.next().charAt(0);

        int a = pr.percentageLetter(s,l);
        System.out.println(a);

    }
}
