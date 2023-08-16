package Array;


/*

An element is called a peak element if its value is not smaller than the value of its adjacent elements(if they exist).
Given an array arr[] of size N, Return the index of any one of its peak elements.




Input:
N = 3
arr[] = {1,2,3}
Possible Answer: 2
Generated Output: 1
Explanation: index 2 is 3.
It is the peak element as it is
greater than its neighbour 2.
If 2 is returned then the generated output will be 1 else 0.



N = 3
arr[] = {3,4,2}
Possible Answer: 1
Output: 1
Explanation: 4 (at index 1) is the
peak element as it is greater than
it's neighbor elements 3 and 2.
If 1 is returned then the generated output will be 1 else 0.
 */
public class PeakElement {

    public int peakElement(int[] arr,int n)
    {
        //add code here.
        if (n == 1)
            return 1;

        if (arr[0] >= arr[1])
            return 0;

        if (arr[n - 1] >= arr[n - 2])
            return n-1;

        for(int i = 1; i<n-1; i++){
            if(arr[i-1] <= arr[i] && arr[i] >= arr[i+1]){
                return i;
            }
        }


        return 0;
    }

    public static void main(String[] args) {
        PeakElement p = new PeakElement();

        int[] arr = {1,4,2,3};

        System.out.println(p.peakElement(arr,arr.length));
    }
}
