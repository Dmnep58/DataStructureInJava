package Strings;

import java.util.Scanner;

public class IntTORoman {

    public String toroman(int num){
        int[] val = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] roman = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<val.length;i++){
            while(num >= val[i]){
                num-=val[i];
                sb.append(roman[i]);
            }
        }

        return  sb.toString();
    }

    public String ToRoman(int num) {
        String[] M = {"", "M", "MM", "MMM"};
        String[] C = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] X = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] I = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        return M[num / 1000] + C[(num % 1000) / 100] + X[(num % 100) / 10] + I[num % 10];

    }

    public static void main(String[] args) {
        int num;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number: ");
        num = sc.nextInt();

        IntTORoman ir = new IntTORoman();

        System.out.println(ir.toroman(num));
        System.out.println(ir.ToRoman(num));
    }
}
