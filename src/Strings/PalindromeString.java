package Strings;

import java.util.Scanner;

public class PalindromeString {
    public boolean isPalindrome(String s) {

        String st="";

        for(int i=0;i<s.length();i++){
            if((s.charAt(i)>='a' && s.charAt(i)<='z') || (s.charAt(i)>='A' && s.charAt(i)<='Z')
                    || (s.charAt(i)>='0' && s.charAt(i)<='9')){
                st +=s.charAt(i);
            }
        }
        System.out.println(st);

        String r="";
        r = st.toLowerCase();

        System.out.println(r);

        int n = r.length()-1;

        for(int i=0;i<r.length();i++){
            if(r.charAt(i)!=r.charAt(n)){
                System.out.println(r.charAt(i)+" "+r.charAt(n));
                return false;

            }
            n--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        String s ;
        System.out.println("enter the string: ");
        s = sc.nextLine();

        PalindromeString ps = new PalindromeString();

        System.out.println(ps.isPalindrome(s));

        sc.close();
    }
}
