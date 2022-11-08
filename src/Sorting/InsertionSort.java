package Sorting;

/*
INSERTION sorting algorithm is one of the easiest way to sort the arrays according to requirements ie
may on ascending or descending.

Approach:
Check the length of the array it must be greater than -1.

run the loop from 1 to arr.length
initialize the array key with the  index (starting with 2nd)
Now check the second index and 1st index value using a loop repeatedly.
if the value of 1st index is more than swap the index and more the index by one ie 1st ind to 2nd and 2nd to 3rd
if not then move the 2nd ind to 3rd.

Time Complexity = O(N^2)
Space Complexity = O(1)
 */

public class InsertionSort {

    public void ArraySort(int[] arr,int n){

        if(n==-1){
            return;
        }

        int j,i;
        for(j=1; j<n; j++){
            int key = arr[j];
            i=j-1;

            while(i>=0 && arr[i]>key){
                arr[i+1] = arr[i];
                i=i-1;
            }

            arr[i+1]=key;
        }
    }
    public static void main(String[] args) {
        int[] arr= {22, 56,34 ,304 , 3, 23, 42,2434};
        InsertionSort ins = new InsertionSort();
        ins.ArraySort(arr,arr.length);

        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

