package stack;


//the main goal of this program is to check the brackets are assigned properly or not
// for example [x+y{z/(g-t)}] is this expression is correct or not.

import java.lang.reflect.Parameter;
import java.util.Scanner;

public class ParenthesisChecker {

    public boolean isValid(String s) {
        char[] stack = new char[s.length()+1];
        int top=0;

        if(s.length()==1){
            if(s.charAt(0)==']' || s.charAt(0)=='}' ||  s.charAt(0)==')'
                    || s.charAt(0)=='[' || s.charAt(0)=='{' ||  s.charAt(0)=='('){
                return false;
            }
        }

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' ||  s.charAt(i)=='['){
                top++;
                stack[top]=s.charAt(i);
            }
            else { if((stack[top]=='(' && s.charAt(i)==')') || (stack[top]=='{' && s.charAt(i)=='}') ||
                    (stack[top]=='[' && s.charAt(i)==']')){
                top--;
            }
            else{
                return false;
            }
            }
        }

        if(top==0){
            return true;
        }

        return false;
    }
    public static void main(String[] args) {
        ParenthesisChecker pc = new ParenthesisChecker();
        String s ;
        Scanner sc = new Scanner(System.in);
        s= sc.next();
        System.out.println(pc.isValid(s));
    }
}
