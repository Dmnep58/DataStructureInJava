package Strings;


import java.util.Scanner;

// Reverse the sentence given
public class ReverseSentence {

    public String Reverse(String s){
        String word="" , rev= "";
        for (int i=0 ;i<s.length(); i++){
            char ch = s.charAt(i);

            if(ch != ' '){
                word += ch;
            }
            else
            {
                rev = word +" "+rev;
                word="";
            }
        }
        return rev;
    }


    // another approach using the spit function.

    public String Rev(String s){
        String ans="";

        String[] word = s.split(" ");
        for (int i = word.length-1; i >= 0; i--){
            ans = ans + word[i]+" ";
        }

        return ans;
    }

    public static void main(String[] args) {
        ReverseSentence r = new ReverseSentence();

        String s;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string");
        s = sc.nextLine();

        System.out.println(r.Rev(s));

        sc.close();
    }
}
