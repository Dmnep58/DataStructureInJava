package Array;
/*
                        Common Element in 3 Sorted Array
Given three arrays sorted in increasing order. Find the elements that are common in all three arrays.

Approach:

Run a loop for all the array till one of them become empty
And also continuously store the common element in between them in an array
Return the array at last

Time complexity : O(n1+n2+n3)
space Complexity : O(n1+n2+n3)
 */
public class CommonElement {

    public void Common(int[] arr1,int[] arr2, int[] arr3,int n1,int n2, int n3){
        if(n1==-1 || n2==-1 || n3==-1)
            return;

        int i=0, j=0, k=0;

        // Run till one of them became null
        while(i<n1 && j<n2 && k<n3){
            // if arr1=arr2 and arr2 = arr3 then print the value
            //and increment the indexes
            if(arr1[i] == arr2[j] && arr2[j]==arr3[k]){
                System.out.print(arr1[i]+" ");
                i++;
                j++;
                k++;
            }

            // if arr1 < arr2 then increment the arr1 index
            else if(arr1[i]<arr2[j]){
                i++;
            }
            //if arr2 is less than arr3 then increment the arr2 index
            else if(arr2[j]<arr3[k]){
                j++;
            }
            // if above both condition fails the increment the index of arr3
            else {
                k++;
            }
        }
    }

    public static void main(String[] args) {
        CommonElement c = new CommonElement();

        int[] arr= {1,2,4,3,5,6,9};

        int[] arr1= {1,4,5};

        int[] arr2 ={1,2,4,5};

        c.Common(arr,arr1,arr2,arr.length,arr1.length,arr2.length);
    }
}
