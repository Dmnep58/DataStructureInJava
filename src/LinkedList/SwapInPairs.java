package LinkedList;

import java.util.List;

/*
swap the linked list in the pairs

 input : 1->2->3->4->null
 output : 2->1->4->3->null
 */
public class SwapInPairs {
    static  class node{
        int data;
        node next;

        public node(int data){
            this.data = data;
            this.next = null;
        }
    }

    node head;

    public void  SortPair(node n){
        if(n==null || n.next==null){
            System.out.println(n);
        }

            node dummy = new node(-1);
            dummy.next=n;
            node current = dummy;

            while(current != null && current.next != null && current.next.next != null){
                node first = current;
                node second = current.next;
                node third = current.next.next;

                first.next = third;
                second.next = third.next;
                third.next = second;
                current = second;
            }


        node temp = dummy.next;
            while (temp!=null){
                System.out.println(temp.data);
                temp= temp.next;
            }

    }

    public static void main(String[] args) {
        node head= new node(1);
        node first = new node(2);
        node second = new node(3);
        node third = new node(4);

        head.next = first;
        first.next = second;
        second.next = third;
        third.next = null;

        SwapInPairs sp = new SwapInPairs();
         sp.SortPair(head);

    }
}
