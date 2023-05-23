package BasicProblems;

import java.util.Scanner;

public class VowelInSring {

    public int CountVowel(String s){
        int count =0;
        int i=0;

        while(i < s.length()){
            char c = s.charAt(i);
                if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                        c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
                count++;
            }
            i++;
        }
        return count;
    }

    public static void main(String[] args) {
        VowelInSring v = new VowelInSring();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");

        String s = sc.next();

        System.out.println("the number of vowels in the string is: "+v.CountVowel(s));

        sc.close();
    }
}
