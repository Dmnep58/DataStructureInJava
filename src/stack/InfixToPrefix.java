package stack;

import java.util.Scanner;

// to convert the infix expression to prefix
/*
1. reverse the expression
2. convert the braces to its conjugate like if ')' then convert it to (
3. now convert the expression to postfix
4. reverse the string and print it
5. noe the expression is in prefix.
 */
public class InfixToPrefix {

    protected static Scanner sc = new Scanner(System.in);


    int top;

    InfixToPrefix(){
        this.top=-1;
    }

    public String reverse(String s){
        String str12;
        StringBuilder str = new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            str.append(s.charAt(i));
        }
        str12 = BraceReverse(str.toString());
        return str12;
    }

    public String BraceReverse(String s){

        char[] ch = new char[s.length()];

        for(int i=0;i<s.length();i++){
            ch[i]=s.charAt(i);
        }
        for(int i=0;i<s.length();i++){
            if(ch[i]==')') {
                ch[i]='(';
                i++;
            }
            else if(ch[i]=='(') {
               ch[i]=')';
                i++;
            }
        }
        StringBuilder str= new StringBuilder();
        for (char c : ch) {
            str.append(c);
        }
        return str.toString();
    }

    public static void main(String[] args) {
        String s;
        System.out.println("enter the expression: ");
        s= sc.next();

        InfixToPrefix ip = new InfixToPrefix();
        System.out.println(ip.reverse(s));

        ToPostFixExpression postFixExpression = new ToPostFixExpression();
        s =  postFixExpression.postExpression(ip.reverse(s));

        System.out.println(ip.reverse(s));
    }
}
