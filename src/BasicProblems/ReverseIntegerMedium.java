package BasicProblems;


import java.util.Scanner;

/*
Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go
outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
 */
public class ReverseIntegerMedium {

    public int reverse(int x) {
        long finalNum = 0;

        while(x!=0){

            int lastDig = x%10;
            finalNum= finalNum*10+ lastDig;
            x= x/10;
        }
        System.out.println(finalNum);
        if(finalNum > Integer.MAX_VALUE || finalNum<Integer.MIN_VALUE){
            return 0;
        }
        if(x<0){
            return (int)(-1*finalNum);
        }
        return (int)finalNum;

    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        n = sc.nextInt();

        ReverseIntegerMedium r = new ReverseIntegerMedium();
        System.out.println(r.reverse(n));

        sc.close();
    }
}
