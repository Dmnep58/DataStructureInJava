package Strings;

import java.util.Scanner;

public class ReverseString {

    public void reverse(String s){
        String ReverseString="";
        for (int i=s.length()-1; i>=0; i--){
            ReverseString += s.charAt(i);
            System.out.println(ReverseString);
        }
        System.out.println(ReverseString);
    }
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        s = sc.next();

        ReverseString string = new ReverseString();
        string.reverse(s);

        sc.close();
    }
}
