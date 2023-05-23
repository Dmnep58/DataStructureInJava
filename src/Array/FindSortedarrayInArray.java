package Array;

import java.util.Scanner;

public class FindSortedarrayInArray {
    public static void main(String[] args) {
        int n ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter n");
        n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("enter array ");
        for (int i=0;i<n;i++){
            arr[i]= scanner.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int count =0;
        int count1 = 0;


        for (int a: arr
             ) {
            System.out.println("max is "+max);
            if(a>max){
                count++;
                System.out.println("counting: "+count);
                max = a;
            }
            else {
                if(count>count1){
                    count1 = count;
                }
                System.out.println("counting 1"+count1);
                count=0;
            }
        }

        if(count1 > count){
            System.out.println(count1);
        }
        else {
            System.out.println(count);
        }
    }
}
