package GFGProblems;

import java.util.Scanner;

/*
Given an array A of n positive numbers. The task is to find the first equilibrium point in an array.
 Equilibrium point in an array is a position such that the sum of elements before it is equal to the sum
 of elements after it.

Note: Return equilibrium point in 1-based indexing. Return -1 if no such point exists.

Example 1:

Input:
n = 5
A[] = {1,3,5,2,2}
Output:
3
Explanation:
equilibrium point is at position 3 as sum of elements before it (1+3) = sum of elements after it (2+2).

 */
public class EquilibriumPoint {

    public static int equilibriumPoint(long arr[], int n) {

        // Your code here

        if(n==1) return 1;

        int i =1;

        long sum = 0;

        for(long a: arr){
            sum +=a;
        }

        long p =0;

        for(long a : arr){

            long sum2 = sum -  (p+a);

            if(p == sum2)
                return i;

            p +=a;
            i++;
        }


        return -1;
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        n= sc.nextInt();

        long[] arr = new long[n];

        System.out.println("enter the elements in the array");
        for (int i = 0;i<n;i++){
            arr[i]= sc.nextInt();
        }

        System.out.println(equilibriumPoint(arr,arr.length));
    }
}
