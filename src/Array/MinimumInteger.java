package Array;

/*
You are given an array A of size N. Let us denote S as the sum of all integers present in the array.
Among all integers present in the array, find the minimum integer X such that S ≤ N*X.

Example:

Input:
N = 3,
A = { 1, 3, 2}
Output:
2
Explanation:
Sum of integers in the array is 6.
since 6 ≤ 3*2, therefore 2 is the answer.

 */
public class MinimumInteger {
    public  int minimumInteger(int N, int[] arr) {
        // code here
        int max = Integer.MIN_VALUE;
        int sum=0;
        int a=0;

        if(N==1){
            return arr[N-1];
        }
        else{
            for(int i =0; i<N ; i++){
                sum +=arr[i];
                if(arr[i]>max){
                    max = arr[i];
                }
            }
        }
        System.out.println(sum);
        System.out.println(max);

        a = sum/max;

        if(max>a)
            return a;
        System.out.println(a);

        return max;

    }

    public static void main(String[] args) {
        MinimumInteger m = new MinimumInteger();
        int[] arr ={3 ,4, 6, 3, 10, 4, 3, 8, 10};
        System.out.println(m.minimumInteger(arr.length,arr));
    }
}
