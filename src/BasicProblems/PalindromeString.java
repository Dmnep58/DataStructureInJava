package BasicProblems;

import java.util.Scanner;

public class PalindromeString {

        public String Reverse(String s){
            String r = "";

            int len = s.length();

            while(len>0){
                r += s.charAt(len-1);
                len--;
            }
            return r;
        }

        public boolean checkPalindrome(String s , String rev){

            for(int i=0;i<s.length();i++){
                if(s.charAt(i) == rev.charAt(i)){
                    continue;
                }
                else
                    return false;
            }

            return true;
        }

    public static void main(String[] args) {
        PalindromeString palindromeString = new PalindromeString();

        Scanner sc = new Scanner(System.in);

        System.out.println("enter a String");
        String s = sc.nextLine();

        System.out.println("The String is palindrome: "+
                palindromeString.checkPalindrome(s,palindromeString.Reverse(s)));

        sc.close();
    }

}

