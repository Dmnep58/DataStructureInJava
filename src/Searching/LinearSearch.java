package Searching;

/*
Linear search Algorithm

linear search is a sequential algorithm which visits every node of the array until it find its desired
value.

Approach:
visit the nodes one by one from the left.
Compare the key value with the array value.
If it matches then return the index value.
Otherwise, return -1 i.e element is not present in the array.

Without Recursion
Time complexity= O(n)
Space Complexity = O(1)

with Recursion
Time complexity= O(n)
Space Complexity = O(n)
 */
public class LinearSearch {

    // Without recursion
    public int linearSearch(int[] arr,int n, int key){
        //Base case:
        if(n==0) return -1;

        for(int i=0; i<arr.length; i++){
            if(arr[i]==key){
                return i+1;
            }
        }
        return -1;
    }

    //With Recursion
    public int linearRecursion(int[] arr,int n,int key){
        //Base Case:
        if(n==0){
            return -1;
        } else if (n-1==key) {
            return n-1;
        }
        else{
            int ans = linearSearch(arr,n-1,key); // recursively search the element one by one.
            return ans;
        }
    }


    public static void main(String[] args) {
        LinearSearch l = new LinearSearch();

        int[] arr ={1,42,12,45,52,41,525,63,25,632};

        int d = l.linearSearch(arr,arr.length,52);
        int e = l.linearRecursion(arr,arr.length,41);
        System.out.println("first element fount at index(1 order): "+d+" and second element found at: "+e);

    }
}
