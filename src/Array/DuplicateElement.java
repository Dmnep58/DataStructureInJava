package Array;
/*
                    To find the Duplicate Elements in the given array

Given an array a[] of size N which contains elements from 0 to N-1, you need to find all the elements
occurring more than once in the given array.


Approach:
Sort the array using any sort method then
Run a loop from o to n-1
compare 1st node with its neighbour node
if Duplicate found then return 1
if note move it ahead by 1 and continue to check again.
Repeat it till the size is max.


Time Complexity: O(n)
Space Complexity: O(1)

 */
public class DuplicateElement {

    // insertion sort to sort the array.
    public int  Duplicate(int[] arr, int size){
        int i,j;

        for(i=1; i<size; i++){
            int key = arr[i];
            j=i-1;

            while (j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }
          for(int k=0;k<size-1;k++){
              if(arr[k]==arr[k+1]){
                  return 1;
              }
          }
          return -1;
    }

    public static void main(String[] args) {
        DuplicateElement d = new DuplicateElement();

        int[] arr = {1,2,32,3,0,1};

        System.out.println(d.Duplicate(arr, arr.length));


    }
}
