package BasicProblems;

import java.util.Scanner;

public class ReverseNumber {
    public int Reverse(int a){
        int reverse=0;

        while(a!=0){
            int digit = a%10;
            reverse = reverse*10+digit;
            a /=10;
        }
        return reverse;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int a = sc.nextInt();

        ReverseNumber reverseNumber = new ReverseNumber();

        System.out.println("The reverse of a number is: "+reverseNumber.Reverse(a));

        sc.close();
    }
}
