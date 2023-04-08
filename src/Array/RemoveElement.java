package Array;

import java.util.Scanner;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int count=0;
        int a=0;
        int[] b = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i] != val){
                b[i]=nums[i];
                System.out.printf("%d ",b[i]);
            }
            else{
                count++;
            }
        }

        for(int i=0;i<b.length;i++){
            nums[i]=b[i];
        }

        return count;
    }

    public static void main(String[] args) {
        RemoveElement rm = new RemoveElement();

        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Enter the size of the array");
        n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("enter the elements in the array: ");
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int val;
        System.out.println("enter the val to remove: ");
        val = sc.nextInt();

        System.out.println("after the operation the output is: ");
        for (int a: arr) {
            System.out.print(a+" ");
        }

        System.out.println("value occurance is: "+rm.removeElement(arr,val));
    }
}
