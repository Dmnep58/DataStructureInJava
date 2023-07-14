package InterviewQuestions;


/*
You are given an array A consisting of N elements.
For a subarray of A of length len, you have to sort the elements of the subarray in a
non-decreasing order. The element at the position ceil(len) is called the median of the
subarray. Consider the array and each subarray to be 1 indexed.

Write a program to answer Q queries of the following types:
• You are given two integers L and R
• You have to find the median of a subarray AL, AL... Ag of the array A


input :
 int[] A = {2, 4, 5, 3, 1, 6}; // Example array
 int[][] queries = {{1, 6}, {2, 4}, {3, 3}}; // Example queries

 output:
        3
        4
        5
 */
import java.util.Arrays;

public class MeadianQueries {
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static int findMedian(int[] arr, int start, int end) {
        int n = end - start + 1;

        // If the subarray has less than or equal to 5 elements, find the median directly
        if (n <= 5) {
            Arrays.sort(arr, start, end + 1);
            return arr[start + (n - 1) / 2];
        }

        // Divide the subarray into groups of 5 and find the median of each group
        for (int i = start; i <= end; i += 5) {
            int subEnd = Math.min(i + 4, end);
            int median5 = findMedian(arr, i, subEnd);
            int pos = start + (i - start) / 5;
            int temp = arr[pos];
            arr[pos] = median5;
            arr[start + (i - start) / 5] = temp;
        }

        // Recursively find the median of medians
        int mid = (end - start) / 10 + start + 1;
        return findMedian(arr, start, mid);
    }

    public static int[] subarrayMedians(int[] A, int[][] queries) {
        int[] medians = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int left = queries[i][0] - 1; // Adjust for 0-based indexing
            int right = queries[i][1] - 1; // Adjust for 0-based indexing

            int medianIndex = (left + right) / 2;
            int median = findMedian(A, left, right);

            medians[i] = A[partition(A, left, right) - left] == median ? median : A[medianIndex];
        }

        return medians;
    }

    public static void main(String[] args) {
        int[] A = {2, 4, 5, 3, 1, 6}; // Example array
        int[][] queries = {{1, 6}, {2, 4}, {3, 3}}; // Example queries

        int[] result = subarrayMedians(A, queries);

        System.out.println("Medians of subarrays:");
        for (int i = 0; i < queries.length; i++) {
            int left = queries[i][0];
            int right = queries[i][1];
            System.out.println("Subarray A[" + left + ", " + right + "]: " + result[i]);
        }
    }
}
