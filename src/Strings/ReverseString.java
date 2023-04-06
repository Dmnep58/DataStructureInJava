package Strings;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class ReverseString {

    public String reverse(@NotNull String s){
        String ReverseString="";
        for (int i=s.length()-1; i>=0; i--){
            ReverseString += s.charAt(i);
            System.out.println(ReverseString);
        }
        System.out.println(ReverseString);

        return ReverseString;
    }

    //reverse a string from the start from the beginning of the string
    public String reverseStr(String s, int k) {
        String str ="";

        for(int i=0;i<k;i++){
            str +=s.charAt(i);
        }

        String  rev = reverse(str);

        for(int i=k;i<s.length();i++){
            rev += s.charAt(i);
        }

        return rev;
    }


    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        s = sc.next();

        ReverseString string = new ReverseString();
//        System.out.println(string.reverse(s));
        System.out.println(string.reverseStr(s,2));

        sc.close();
    }
}
