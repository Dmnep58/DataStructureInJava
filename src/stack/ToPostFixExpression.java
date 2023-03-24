package stack;

import java.util.Scanner;


//Approach
/*     1. Print the operand as they arrive.

       2. If the stack is empty or contains a left parenthesis on top, push the incoming operator on to the stack.

       3. If the incoming symbol is '(', push it on to the stack.

       4. If the incoming symbol is ')', pop the stack and print the operators until the left parenthesis is found.

       5.If the incoming symbol has higher precedence than the top of the stack, push it on the stack.

       6. If the incoming symbol has lower precedence than the top of the stack, pop and print the top of the stack.
       Then test the incoming operator against the new top of the stack.

       7. If the incoming operator has the same precedence with the top of the stack then use the associativity rules.
       If the associativity is from left to right then pop and print the top of the stack then push the incoming
       operator. If the associativity is from right to left then push the incoming operator.

       8. At the end of the expression, pop and print all the operators of the stack.

 */
public class ToPostFixExpression {
    protected  static Scanner sc = new Scanner(System.in);
    int top;

    ToPostFixExpression(){
        this.top=-1;
    }
    static  char[] postfix = new char[100];



    public int prec(char c){
        if(c=='^')
            return 3;

       else if(c=='/' || c=='*' || c=='%')
            return 2;

        else if(c=='+' || c=='-')
            return 1;

        else return -1;
    }

    public void push(char ch){
        if(top>10){
            System.out.println("overflow");
        }
       else {
            top++;
            postfix[top]=ch;
        }
    }

    public void pop(){
        if(top == -1){
            System.out.println("Stack Underflow");
            return;
        }
        top--;
    }
    public boolean isempty(){
        if(top<0)
            return true;

        return false;
    }

    public String postExpression(String s){
        String expression="";
        for(int i = 0; i< s.length(); i++){


               if((s.charAt(i)>='a' && s.charAt(i)<='z')||(s.charAt(i)>='A' && s.charAt(i)<='Z') || (s.charAt(i)>='0' && s.charAt(i)<='9')){
                   expression += s.charAt(i);
               }
               else if (s.charAt(i)=='('){
                   push(s.charAt(i));
               }
               else if (s.charAt(i)==')'){
                   while(isempty()==false && postfix[top] !='('){
                       expression +=postfix[top];
                       pop();
                   }
                   if(isempty()==false){
                      pop();
                   }
               }
               else  {
                   while (!isempty() && (prec(postfix[top])>=prec(s.charAt(i)))){
                       expression +=postfix[top];
                       pop();
                   }
                  push(s.charAt(i));
               }
        }
        while (!isempty()){
            expression+=postfix[top];
            pop();
        }
        return expression;
    }

    public static void main(String[] args) {
        ToPostFixExpression ep = new ToPostFixExpression();
        String s ;
        System.out.println("Enter the expression: ");
        s = sc.next();
        System.out.println(ep.postExpression(s));

    }
}
