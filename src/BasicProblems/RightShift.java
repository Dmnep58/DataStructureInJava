package BasicProblems;


import java.util.Scanner;

/*
Given 2 integers m, and n (decimal system), write a program to perform right
shift on m , n times.
 */
public class RightShift {

    public int Shift(int value , int times){
        int result = 0;

        for(int i =0 ;i< times ;i++){
            result = value >> 2;
        }

        return result;
    }

    public static void main(String[] args) {
        RightShift r = new RightShift();

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the value");
        int value = sc.nextInt();

        System.out.println("enter the number of times shift should be done");
        int shift = sc.nextInt();

        System.out.println(r.Shift(value,shift));


    }
}
