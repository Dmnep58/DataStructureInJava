package Array;
/*
            Sub array is a contiguous part of an array

Approach:


Run  a loop from i=0 to n

to find the sub arrays from the array
   Run a loop from j=i to n

 to print the sub arrays
      Run a loop from k=j to i
          print the arrays.
 */
public class SubArray {

    public  void SubArrays(int[] arr, int size){

        int sum =0;

        for(int i=0; i<size; i++){
            for(int j =i; j<size; j++){
                for(int k=i; k<=j;k++){
                    System.out.print(arr[k]+" ");
                    //to print the sum of the sub array just use sum instead of printing the number.
                    sum=sum+arr[k];
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
       SubArray s = new SubArray();

       int[] arr={1,-4,7,2};

       s.SubArrays(arr,arr.length);

    }
}
