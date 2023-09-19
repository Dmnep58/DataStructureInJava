package GFGProblems;

/*
Given an integer N. The task is to return the position of first set bit found from the right side in the binary representation of the number.
Note: If there is no set a bit in the integer N, then return 0 from the function.

Example 1:

Input:
N = 18
Output:
2
Explanation:
Binary representation of 18 is 010010,the first set a bit from the right side is at position 2.
Example 2:

Input:
N = 12
Output:
3
Explanation:
Binary representation of  12 is 1100, the first set a bit from the right side is at position 3.

 */

import java.util.Scanner;

public class FindFirstSetBit {

    public static int getFirstSetBit(int n){

        // Your code here
        String binary="";

        while(n>0){
            binary +=String.valueOf(n%2);
            n/=2;
        }

        int count=0;

        System.out.println(binary);

        for(int i=0;i<binary.length();i++){
            count++;
            if(binary.charAt(i)=='1'){
                break;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a = getFirstSetBit(n);
        System.out.println("the first set bit is: "+a);
    }
}
