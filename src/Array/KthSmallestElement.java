package Array;

/*
             Kth  the smallest Element in the given array.

Approach:
Sort the array and then print the index element which is required.

Time Complexity: O(n) for the insertion sort
 */
public class KthSmallestElement {

    public void sort(int[] arr,int size){
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
        KthSmallestElement k = new KthSmallestElement();
        int[] arr ={1,0,5,3,6,7,8,90,54,34,26,51};

        k.sort(arr,arr.length);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        int number =6; //6th smallest and biggest number in array
        System.out.println("the kth smallest element in the array is: "+ arr[number-1]);
        System.out.println("The Kth biggest element in the array is: "+ arr[arr.length-number-1]);
    }
}
