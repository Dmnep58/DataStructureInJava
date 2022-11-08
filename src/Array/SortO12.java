package Array;
/*
Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order.

Approach:
count the number of 0's , 1's and 2's in the given array
know insert the numbers of o 1 and 2 according to its length

Time complexity : O(n)
 */

public class SortO12 {

    public void SortArray(int[] arr, int size){
        int count0=0,count1=0,count2=0;

        for(int i=0;i<size;i++){
            if(arr[i]==0){
                count0++;
            }

            if(arr[i]==1){
                count1++;
            }

            if(arr[i]==2){
                count2++;
            }
        }

        int lengthOfArray=0;

        for(int i=0; i<count0; i++){
            arr[lengthOfArray]=0;
            lengthOfArray++;
        }

        for (int i=0; i<count1;i++){
            arr[lengthOfArray]=1;
            lengthOfArray++;
        }

        for (int i=0;i<count2;i++){
            arr[lengthOfArray]=2;
            lengthOfArray++;
        }
    }

    public static void main(String[] args) {
        SortO12 s = new SortO12();

        int[] arr= {1,0,0,1,0,1,2,2,0,2,1,2,1,0,2,0,2};

        s.SortArray(arr,arr.length);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
