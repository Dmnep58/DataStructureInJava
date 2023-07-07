package BasicProblems;

import java.util.Scanner;

/*
You are climbing a staircase. It takes n steps to reach the top.
Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

                                    Example:

Input: n = 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step

 */
public class ClimbingStrais {

    public int climb(int n){
        int a =0;
        return a;
    }

    public static void main(String[] args) {
        ClimbingStrais c = new ClimbingStrais();

        int n;

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number of stairs ");

        n = sc.nextInt();

        System.out.println(c.climb(n));

        sc.close();
    }
}
