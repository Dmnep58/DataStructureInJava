package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
            Find the missing integer in the array starting from 0 but not sequential
Approach:
Run a loop from 0 to size
and compare the value of i with the arr[i]
if it matches continue if not return that element

Time complexity : O(n)
Space Complexity : O(1)
 */
public class MissingInteger {
    public int MissingNumber(int[] arr,int size){

        // check for more than one number every time like  up to 10 total sum must be (size+1)(size+2)/2 == n(n+1)/2
        // so in formula one is added
        int total = (size+1)*(size+2)/2;  //sum of first natural number.
        int number = 0;
        for(int i : arr){
           number = number + i;
        }
        System.out.println(total);
        System.out.println(number);
        return total-number;
    }

    //another way

    public int Missingvalue(int[] arr){
        Arrays.sort(arr);

        int max=  arr[arr.length-1];
        System.out.println(max);

        for(int i =0;i<max ;i++){
            if(arr[i]!=i){
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        MissingInteger m = new MissingInteger();

        int[] arr = {1,3,2,4,6,8,5,9,10};

        System.out.println(m.MissingNumber(arr, arr.length));
        System.out.println(m.Missingvalue(arr));
    }
}
