package Strings;

import java.util.Scanner;

public class ToLowerCaseString {

    public String lower(String s){

        String str="";
        for(int i=0;i<s.length();i++){
           char ch =s.charAt(i);

            if(65 <= ch && ch<= 90){
                ch =(char)(ch + 32);

                str += ch;
            }
            else{
                str += s.charAt(i);
            }
        }

        return str;
    }

    public static void main(String[] args) {
        ToLowerCaseString ls = new ToLowerCaseString();

        Scanner sc = new Scanner(System.in);

        String s ;
        System.out.println("Enter the String: ");
        s = sc.next();

        System.out.println(ls.lower(s));

        sc.close();


    }
}
