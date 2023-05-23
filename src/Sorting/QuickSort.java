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
                for(int a : arr){
                    System.out.print(a+" ");
                }
                System.out.println();
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

        int[] arr= {10,80,30,90,40,50,70};
        q.Sort(arr,0, arr.length-1);
        q.display(arr,arr.length);
    }
}
