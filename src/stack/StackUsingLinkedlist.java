package stack;

import java.util.Scanner;
import java.util.Stack;

public class StackUsingLinkedlist {

    static  class node{
        int data;
        node next;

        public node(int data){
            this.data=data;
            this.next=null;
        }
    }

    node top;

    public void push(int data){
        node current = new node(data);

        if(top==null){
            top=current;
        }
        else{
            current.next = top;
            top=current;
        }
    }

    public void pop(){
        if(top==null){
            System.out.println("stack underflow");
        }else {
            top=top.next;
        }
    }
    public void display(){
        if(top==null){
            System.out.println("empty stack");
        }
        while(top!=null){
            System.out.println(top.data);
            top=top.next;
        }
    }

    public static void main(String[] args) {
        StackUsingLinkedlist st = new StackUsingLinkedlist();


        st.push(1);
        st.push(2);
        st.pop();
        st.push(4);
        st.push(5);
        st.display();

    }
}
