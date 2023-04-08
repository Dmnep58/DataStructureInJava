package Strings;

import java.util.Scanner;

public class SplitToMakePalindrome {

    public boolean isPalindrome(String s){
        int n = s.length()-1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=s.charAt(n)){
                return false;
            }
            n--;
        }
        return true;
    }
    public boolean checkPalindromeFormation(String a, String b) {
        int n = a.length()/2;
        int m = b.length()/2;

        String s = a.substring(0,n);
        String r = b.substring(m);

        s +=r;

        System.out.println(s);

        String s1 = a.substring(n);
        String  r1 = b.substring(0,m);

        s1 +=r1;

        System.out.println(s1);

        if(isPalindrome(s1) == true || isPalindrome(s) == true)
            return true;

        return false;
    }

    public static void main(String[] args) {

        String s,r;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string");
        s = sc.next();

        System.out.println("Enter the second string");
        r = sc.next();

        SplitToMakePalindrome sp = new SplitToMakePalindrome();
        System.out.println(sp.checkPalindromeFormation(s,r));
    }
}
