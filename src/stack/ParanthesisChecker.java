package stack;


//the main goal of this program is to check the brackets are assigned properly or not
// for example [x+y{z/(g-t)}] is this expression is correct or not.

import java.util.Scanner;

public class ParanthesisChecker {
    public static void main(String[] args) {

        String s;
        Scanner sc = new Scanner(System.in) ;
        System.out.print("enter the expression: ");
        s = sc.next();

        char[] ch= new char[s.length()+1];

        int top=-1;

        System.out.println(s.length());

        for (int i=0;i<s.length();i++){

            if(s.charAt(i)=='[' || s.charAt(i)=='{' ||s.charAt(i)=='('){
                top++;
                ch[top]=s.charAt(i);
                System.out.println("pushed");
            }

             if((s.charAt(i)==']' && ch[top]=='[') || (s.charAt(i)=='}' && ch[top]=='{') || (s.charAt(i)=='}'  &&  ch[top]=='(')){
                top--;
                System.out.println("poped");
            }

        }
        System.out.println(ch.length);
        if(top==-1)
            System.out.println("valid");
        else
            System.out.println("invalid");
        sc.close();

    }
}
