package Array;

import java.util.Scanner;

public class RemoveElement {
    public int removeElement(int[] numbs, int val) {
        int count = 0;

        int[] b = new int[numbs.length];

        for(int i=0; i<numbs.length; i++){
            if(numbs[i] != val){
                b[count]=numbs[i];
                count ++;
            }
        }

        for(int i=0;i<b.length;i++){
            numbs[i]=b[i];
            System.out.println(numbs[i]+" testing");
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

        System.out.println("\nvalue occurance is: "+rm.removeElement(arr,val));

        sc.close();
    }
}
