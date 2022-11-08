package Array;
/*
Sorting of the array.

Array can be sorted using different approaches or using different sorting algorithms
1. Insertion Sort.
2. Merge Sort.
3. Quick Sort.
4. Heap Sort and so on.

According to the time complexity specified we can use any of the sorting algorithms.

In this I have used the insertion sort algorithm.
 */
public class SortArray {

    public void Sort(int[] arr,int size){
        int k;
        for(int i=1;i<size;i++){
            k=arr[i];

            int j=i-1;

            while(j>=0 && arr[j]>k){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]= k;
        }
    }

    public static void main(String[] args) {
        SortArray a = new SortArray();
        int[] arr = {1,9,2,8,4,7,5,6,0};

        a.Sort(arr,arr.length);

        for(int i=0; i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
