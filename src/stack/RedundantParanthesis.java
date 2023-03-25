package stack;


import java.util.Scanner;

// check the parenthesis used in the  expression is redundant or not
public class RedundantParanthesis {

    static char[] stack = new char[20];
    int top;
    RedundantParanthesis(){
        this.top =-1;
    }

    public void push(char ch){
        if(top>stack.length){
            System.out.println("stack overflow");
        }
        else{
            top++;
            stack[top]=ch;
        }
    }

    public void pop(){
        if(top<0){
            System.out.println("stack underflow");
        }
        top--;
    }

    public boolean RedundantCheck(String s){
        boolean red = false;

        for(int i=0;i<s.length();i++){
            //push the operators if present
            if(s.charAt(i) =='+' || s.charAt(i) =='-' || s.charAt(i) =='/' || s.charAt(i) =='*'){
                push(s.charAt(i));
            }

            // push the opening braces if present
            if(s.charAt(i)=='('){
                push(s.charAt(i));
            }

            if(s.charAt(i)==')'){
                //if present char is closing braces and top od the stack is opening braces then redundancy present
                if(stack[top]=='('){
                    red=true;
                }
                //pop till the opening braces if operator
                while(s.charAt(i) =='+' || s.charAt(i) =='-' || s.charAt(i) =='/' || s.charAt(i) =='*'){
                    pop();
                }
                pop();
            }
        }

        return red;
    }

    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        s= sc.next();

        RedundantParanthesis rd = new RedundantParanthesis();
        System.out.println(rd.RedundantCheck(s));

        sc.close();
    }
}
