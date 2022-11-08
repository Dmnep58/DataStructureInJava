package Array;
/*
Array can be reversed in different ways
1. Just print hte array in reverse order
2. Swap the index values starting from the first and last index.
3. copy the array arr in b from last index of array arr


Time Complexity : O(n)
 */
public class ReverseArray {

    // time complexity = O(n)
    public void ArrayReverseOrder(int[] arr ,int size){
        for(int i =size-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public void ArrayReverseCopy(int[] arr,int size){
        int[] b = new int[size];

        int j=0;
        for(int i=size-1;i>=0;i--){
            b[j]=arr[i];
            j++;
        }
        for(int i=0;i<size;i++){
            System.out.print(b[i]+" ");
        }
        System.out.println();
    }

    public void ArrayReverseIndexSwap(int[] arr,int size){
        int start =0;
        int end = size-1;
        while(start<end){
            int temp = arr[start];
            arr[start]= arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }


    public static void main(String[] args) {
        ReverseArray r = new ReverseArray();

        int[] arr= {1,2,3,4,5,6,7,8,9};
        r.ArrayReverseCopy(arr,arr.length);

        int[] ar= {2,3,4,5,6,7,8,9};
        r.ArrayReverseOrder(ar,ar.length);

        int[] a= {3,4,5,6,7,8,9};
        r.ArrayReverseIndexSwap(a,a.length);

    }
}
