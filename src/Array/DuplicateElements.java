package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class DuplicateElements {

    public static ArrayList<Integer> duplicates(int[] arr, int n) {
        // code here

        ArrayList<Integer> al = new ArrayList<>();
        Arrays.sort(arr);
        for(int i = 0; i < n-1; i++){

            if(arr[i]==arr[i+1] && !(al.contains(arr[i]))){
                al.add(arr[i]);
                i++;
            }
        }
        if(al.isEmpty())
            al.add(-1);

        return al;
    }

    public static void main(String[] args) {

        int[] arr ={
                13, 9 ,25, 1, 1 ,0 ,22, 13, 22, 20, 3 ,8 ,11, 25, 10, 3 ,15, 11, 19 ,20, 2, 4, 25, 14, 23, 14};

        ArrayList<Integer> al = duplicates(arr,arr.length);

        for(int a : al ){
            System.out.println(a);
        }
    }
}
