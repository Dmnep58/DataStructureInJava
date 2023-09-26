package GFGProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
Given an array A of integers and another number K. Find all the unique quadruple from the
given array that sums up to K.

Also note that all the quadruples which you return should be internally sorted, ie for any
 quadruple [q1, q2, q3, q4] the following should follow: q1 <= q2 <= q3 <= q4.

Example 1:

Input:
N = 5, K = 3
A[] = {0,0,2,1,1}
Output: 0 0 1 2
Explanation: Sum of 0, 0, 1, 2 is equal
to K.
Example 2:

Input:
N = 7, K = 23
A[] = {10,2,3,4,5,7,8}
Output: 2 3 8 10
        2 4 7 10
        3 5 7 8
Explanation: Sum of 2, 3, 8, 10 = 23,
sum of 2, 4, 7, 10 = 23 and sum of 3,
5, 7, 8 = 23.
 */

class FourSum {
    public ArrayList<ArrayList<Integer>> fourSum(int[] arr, int target) {
        // code here
        Arrays.sort(arr);

        ArrayList<ArrayList<Integer>> a = new ArrayList<>();
        for(int i = 0; i<arr.length;i++){
            // check the value of i must be grater than 0 and if last
            // and recent element is same then continue
            if(i>0 && arr[i]==arr[i-1]) continue;

            for(int j = i+1; j<arr.length;j++){

                // check the positionof the array than it is located just +1 side by i and previous
                // and recent element of the j is not same.
                if(j!= (i+1) && arr[j] == arr[j-1]) continue;

                // check the kth values form j+1
                int k=j+1;

                // check the ith value fromt he last of the array
                int l = arr.length-1;

                // check that the value of k should not be equal to and greater than l.
                while( k < l ){
                    // calculate the sum of the elements.
                    long sum = arr[i] +arr[j] + arr[k]+arr[l];


                    if(sum == target){

                        // storing the values  in the arraylist
                        ArrayList<Integer> al = new ArrayList<>();
                        al.add(arr[i]);
                        al.add(arr[j]);
                        al.add(arr[k]);
                        al.add(arr[l]);

                        //adding the arraylist in the main arraylist
                        a.add(al);

                        //increasing anf decrease the index accordingly
                        k++;
                        l--;

                        //check if the values is same as previous to avoid duplicates
                        while(k<l && arr[k] == arr[k-1]) k++;
                        while(k<l && arr[l] ==  arr[l+1]) l--;

                    }
                    else{
                        // if sum is less increase it accordingly
                        if(sum < target) k++;
                            // else decrese it means move forward
                        else l--;
                    }

                }
            }


        }
        return a;

    }

    public static void main(String[] args) {
        FourSum f = new FourSum();

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();

        int[] arr= new int[n];

        System.out.println("Enter elements in array");
        for(int i= 0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("enter the sum to be calculated");

        int k  = sc.nextInt();
        ArrayList<ArrayList<Integer>> a = f.fourSum(arr,k);

        for(ArrayList<Integer> al : a){
            System.out.println(al);

        }
    }
}

