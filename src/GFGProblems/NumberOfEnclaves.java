package GFGProblems;

/*
You are given an n x m binary matrix grid, where 0 represents a sea cell and 1 represents a land cell.

A move consists of walking from one land cell to another adjacent (4-directionally) land cell or walking
 off the boundary of the grid.

Find the number of land cells in grid for which we cannot walk off the boundary of the grid in any number of moves.

Example 1:

Input:
grid[][] = {{0, 0, 0, 0},
            {1, 0, 1, 0},
            {0, 1, 1, 0},
            {0, 0, 0, 0}}
Output:
3
Explanation:
0 0 0 0
1 0 1 0
0 1 1 0
0 0 0 0
The highlighted cells represents the land cells.
 */

public class NumberOfEnclaves {

    public static int numberOfEnclaves(int[][] grid) {
        int count=0;

        for(int i=0; i<grid.length;i++){
            for(int j=0; j<grid[0].length;j++){
                if(i==0 || j==0 || i== grid.length-1 || j ==grid[0].length-1){
                    if(grid[i][j] == 1){
                        dfs(grid,i,j);
                    }
                }
            }
        }

        for (int[] ints : grid) {
            for (int j = 0; j < grid[0].length; j++) {
                if (ints[j] == 1) {
                    count++;
                }
            }
        }

        // Your code here
        return count;
    }


    public static void dfs(int[][] arr, int i , int j){
        if(i<0 || j<0 || i>=arr.length || j>=arr[0].length || arr[i][j]==0){
            return;
        }
        arr[i][j]=0;

        dfs(arr,i+1,j);
        dfs(arr,i,j+1);
        dfs(arr,i-1,j);
        dfs(arr,i,j-1);
    }

    public static void main(String[] args) {
        int[][] arr={{0, 0, 0, 0},
                {1, 0, 1, 0},
                {0, 1, 1, 0},
                {0, 0, 0, 0}};

        System.out.println(numberOfEnclaves(arr));
    }
}

