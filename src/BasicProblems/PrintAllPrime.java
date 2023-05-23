package BasicProblems;

import java.util.Scanner;

public class PrintAllPrime {

    public static boolean isPrime(int n) {
        // 0 and 1 are neither prime nor composite numbers
        if (n == 0 || n == 1) {
            return false;
        }
        // 2 is a prime number
        if (n == 2) {
            return true;
        }
        // every composite number has a prime factor
        // less than or equal to its square root.
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        PrintAllPrime p = new PrintAllPrime();

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number: ");
        int a = sc.nextInt();

        System.out.println("enter the second nnumber: ");
        int b = sc.nextInt();

        for (int i = a; i<=b;i++){
            if(isPrime(i)==true){
                System.out.println(i);
            }
        }

        sc.close();
    }

}
