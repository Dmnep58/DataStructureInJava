package BasicProblems;

import java.util.Scanner;

public class CheckPowerOfTwo {

    public boolean check(int a){

        int i=1;
        int s =1;
        while(s < a){
            s = (int)Math.pow(2,i);
            i++;
            if(s>a)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");

        a = sc.nextInt();

        CheckPowerOfTwo c = new CheckPowerOfTwo();
        System.out.println(c.check(a));
    }
}
