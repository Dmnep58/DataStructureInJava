package LinkedList;


import javax.swing.*;
import java.util.Scanner;


class CheckCircularList{
    class list{
        list next;
        int data;

        list(int data) {
            this.data = data;
            this.next = null;
        }
    }
    list head;

    public void insertdata(int data){
        list current = new list(data);

        if(head==null){
            head= current;
            current.next=head;
        }

        list temp;
        temp=head;

        while(temp.next !=head){
            temp=temp.next;
        }
        temp.next=current;
        current.next=head;

    }

    // make a simple single linked list

    void InsertData( int data){
        list current = new list(data);

        // check if the head node is empty or not.
        if(head == null){
            head=current;
            return;
        }
        list temp = head;
        while(temp.next !=null){ // traverse to the last node
            temp=temp.next;
        }
        temp.next=current; //add the node
    }

    public boolean iscircular(){
        list temp = head;

        while(temp.next!=head){
            temp=temp.next;
        }

        if(temp.next == head){
            return true;
        }

        return false;

    }


    public static void main(String[] args) {
        CheckCircularList linkedlist = new CheckCircularList();
        linkedlist.insertdata(1);
        linkedlist.insertdata(12);
        linkedlist.insertdata(13);
        System.out.println(linkedlist.iscircular());

        CheckCircularList linkedlist1 = new CheckCircularList();
        System.out.println(linkedlist1.iscircular());
    }

}