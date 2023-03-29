package Sorting;

/* QuickSort
This algorithm is based on Divide and Conquer.
First the array are partitioned and then sorting is performed.


Time Complexity : O(NlogN)
Space Complexity : O(1)
                   O(N) for Recursion.

 */
public class QuickSort {

    // To swap elements
    public static void swap(int[] arr,int l,int h){
        int temp = arr[l];
        arr[l] = arr[h];
        arr[h] = temp;

    }

    // partition the array into halves so that they can be sorted
    public static int Partition(int[] arr, int l , int h){
        int pivot  = arr[h];
        int i = l-1;

        for(int j=l;j<=h-1;j++){
            if(arr[j]< pivot)
            {
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,h);
        return (i+1);
    }

    // combine the sorted array int the order they to be.
    public void Sort(int[] arr,int l, int h){
        if(l<h){
            int pi = Partition(arr,l,h);
            Sort(arr,l,pi-1);
            Sort(arr,pi+1,h);
        }
    }

    // to display the array

    public void display(int[] arr,int size){
        for(int i =0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }


    public static void main(String[] args) {
        QuickSort q = new QuickSort();

        int[] arr= {1,21,32,43,54,65,76,87,89};
        q.Sort(arr,0, arr.length-1);
        q.display(arr,arr.length);
    }
}
