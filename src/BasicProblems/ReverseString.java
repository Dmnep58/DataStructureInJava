package BasicProblems;

import java.util.Scanner;

public class ReverseString {
    public String Reverse(String s){
        String r = "";

        int len = s.length();

        while(len>0){
            r += s.charAt(len-1);
            len--;
        }
        return r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        ReverseString reverseString= new ReverseString();
        System.out.println("the reverse string is: "+reverseString.Reverse(s));

        sc.close();
    }

}
