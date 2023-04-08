package Strings;

import java.util.Scanner;

/*
You are given a string s of even length. Split this string into two halves of equal lengths,
and let a be the first half and b be the second half.
 */
public class AlikeString {

    public int count(String s){

        int count =0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' ||s.charAt(i)=='o'|| s.charAt(i)=='u'
           || s.charAt(i)=='A'|| s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U'){
                count++;
            }
        }
        return count;
    }

    public boolean halvesAreAlike(String s) {
        int n = s.length()/2;
        System.out.println(n);

        String s1 = s.substring(0,n);
        System.out.println(s1);

        String s2 = s.substring(n);
        System.out.println(s2);

        int a = count(s1);
        int b = count(s2);

        if(a==b){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        AlikeString ak = new AlikeString();
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        s = sc.next();

        System.out.println(ak.halvesAreAlike(s));

        sc.close();
    }
}
