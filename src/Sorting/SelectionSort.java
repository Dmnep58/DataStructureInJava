package Sorting;

/*
Selection Sort is a sorting technique in which begining element is swaped with the smallest element in the sorted array.

Approach:
1. Iterate from 0 to n-1
2. Find the minimum element from the unsorted array.
3. swap the minimum element with the beginning element.
4. Repeat the process until the array is sorted or reaches its final length.

Time Complexity = O(n^2)
Space Complexity = O(1)
 */

class SelectionSort {
    void SelectionSorting(int[] arr, int n) {
        // outer loop for n time
        for (int i = 0; i < n - 1; i++) {
            // inner loop for n-1 times.
            for (int j = i + 1; j < n; j++) {
                // check the condition to swap the numbers.
                if (arr[j] < arr[i]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        // display elements in the array.
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        SelectionSort s = new SelectionSort();
        int[] arr = { 34, 12, 90, 54, 62, 21, 43 };

        s.SelectionSorting(arr, arr.length);

    }

}
