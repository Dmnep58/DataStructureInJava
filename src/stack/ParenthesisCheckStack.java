package stack;

import java.util.Stack;

public class ParenthesisCheckStack {

    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        boolean istrue = false;

        char[] ch = new char[x.length()];

        for(int i=0;i<x.length();i++){
            ch[i] = x.charAt(i);
        }


        Stack<Character> st = new Stack<>();

        for(int i=0;i<ch.length;i++){
            if(ch[i] == '(' || ch[i]=='{' || ch[i]=='['){
                st.push(ch[i]);
            }
            else{
                if ( (ch[i] == ']' && st.peek()=='[') || (ch[i] == '}' && st.peek()=='{' ) || (ch[i] == ')'&& st.peek()=='(')) {
                       st.pop();
                }
                else{
                    istrue = false;
                }
            }
        }
        if(st.isEmpty()){
            istrue = true;
        }
        return istrue;
    }

    public static void main(String[] args) {
        System.out.println(ispar("([{}])"));
    }
}
