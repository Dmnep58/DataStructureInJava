package Sorting;


// Merge Sort Algorithm
/*
Approach:
divide the array into two sub arrays continue it till its nodes became single
join the array in the sorted order


Time Complexity: O(nlogN)
Space complexity: O(n)
 */

public class MergeSort {


    // Merge sort function
    // the l stands for first index of the array and the h is the last index of the array
    public static void Merge(int[] arr, int l, int mid, int h) {

        int index1 = mid - l + 1; // length of 1st array
        int index2 = h - mid; // length of second array


        int[] A = new int[index1]; //1st array
        int[] B = new int[index2]; //2nd array

        // run from 0 to A.length for A to copy data
        for (int i = 0; i < index1; ++i) {
            A[i] = arr[l + i];
        }

        // run from 0 to B.length for B to copy data
        for (int i = 0; i < index2; ++i) {
            B[i] = arr[mid + 1 + i];
        }

        int i = 0, j = 0;
        int k = l;

        //run the array by checking their sizes and insert the values according to their value on the
        // basis of the comparison showed below.
        while (i < index1 && j < index2) {
            if (A[i] <= B[j]) {
                arr[k] = A[i];
                i++;
            } else {
                arr[k] = B[j];
                j++;
            }
            k++;
        }

        //if index1 is remaining then completely copy the divide array A in the main array ie arr
        while (i < index1) {
            arr[k] = A[i];
            i++;
            k++;
        }

        //if index2 is remaining then completely copy the divide array B in the main array ie arr
        while (j < index2) {
            arr[k] = B[j];
            j++;
            k++;
        }

    }
    // merge sort algorithm
    public static void ArraySort(int[] arr, int l,int h){
        if(l<h){
            // calculate mid of the array
            int mid = l+(h-l)/2;

            //divide the 1st from array
            ArraySort(arr,l,mid);

            // divide the second array
            ArraySort(arr,mid+1,h);

            // merge the array for sorting
            Merge(arr,l,mid,h);
        }
    }
    public static void main(String[] args) {
        int[] arr= {22, 56,34 ,304 , 3, 23, 42,244};
        MergeSort ins = new MergeSort();
        ins.ArraySort(arr,0,arr.length-1);

        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

