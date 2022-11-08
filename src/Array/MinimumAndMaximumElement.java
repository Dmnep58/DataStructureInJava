package Array;

/*
To find the maximum and minimum elements in the array

Approach:
assign integer max value to min and integer min value to max
now check the min until it will get less value than the update value of the min
and same for the max but for max value

Time Complexity: O(n)
Space Complexity: O(1)
 */
public class MinimumAndMaximumElement {
    public  void MaxMinElement(int[] arr,int size){
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        for(int i=0;i<size;i++){
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }

        System.out.println("The max element in the array is: "+max+"\n The min element in the array is: "+min);
    }

    public static void main(String[] args) {
        MinimumAndMaximumElement mm = new MinimumAndMaximumElement();
        int[] arr = {1,-9,7,5,3,2,4,98,6,8,0,12};

        mm.MaxMinElement(arr,arr.length);
    }
}
