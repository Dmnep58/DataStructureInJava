package BasicProblems;


// a number is said to armstrong if each digit cuber some is equal to that number like
// 153 = 1^3 + 5^3 + 3^3

import java.util.Scanner;

public class ArmstrongNumber {

    public boolean IsArmstrong(int n){

        int rem;
        int sum=0;
        int original = n;

        while (n !=0 ){
            rem= n%10;
            sum += (int)Math.pow(rem,3);
            n /=10;
        }

        return sum == original;
    }

    public static void main(String[] args) {
        ArmstrongNumber a = new ArmstrongNumber();

        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number");

        int num = sc.nextInt();

        System.out.println(num+"is a Armstrong number :"+a.IsArmstrong(num));

        sc.close();
    }
}
