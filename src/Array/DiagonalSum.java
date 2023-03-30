package Array;

import java.util.Scanner;

/*
Given a matrix you have to calculate the sum of the diagonal

Approach
There are 2 types of diagonals in the matrix
1. primary
2. secondary

for primary diagonal if the i th index == jth index then it is counted as primary diagonal
2. if ith index is not equal to the  j th index the index of the matrix is secondary diagonal


example
1 2 3
4 5 6
7 8 9

so diagonal sum = 1+ 5 + 9 + 3 + 7 = 25

Time complexity = 0(N)
 */
public class DiagonalSum {
    public int DSum(int[][] arr){

        int sum=0;
        int i=0;
        int j=0;

        // for the primary diagonal
        while(i<arr.length){
            if(i==j){
                sum += arr[i][j];
            }
            i++;
            j++;
        }

        i=0;
        j= arr.length-1;
        // for the secondary diagonal
        while(i<arr.length){
            if(i !=j){
                sum += arr[i][j];
            }
            i++;
            j--;
        }


        return sum;
    }

    public static void main(String[] args) {
        DiagonalSum ds = new DiagonalSum();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the m*n square matrix length: ");
        int m = sc.nextInt();
        int n= sc.nextInt();

        int[][] arr= new int[m][n];



        System.out.println("enter the elements in the array");
        for(int i =0 ;i<arr.length;i++){
            for(int j=0; j<arr.length;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println(ds.DSum(arr));
    }
}
