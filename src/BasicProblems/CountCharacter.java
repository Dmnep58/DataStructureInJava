package BasicProblems;

import java.util.Scanner;

public class CountCharacter {

    public int countAlpha(String s){
        int count =0;

        int i=0;
        while(i < s.length()){
            char ch = s.charAt(i);
            if( (ch >='a' && ch <='z') || (ch >='A' && ch <='Z')){
                count++;
            }
            i++;
        }

        return count;
    }

    public static void main(String[] args) {
        CountCharacter c = new CountCharacter();

        Scanner sc  = new Scanner(System.in);

        System.out.println("Enter a string");
        String s = sc.nextLine();

        System.out.println(c.countAlpha(s));

        sc.close();
    }
}
