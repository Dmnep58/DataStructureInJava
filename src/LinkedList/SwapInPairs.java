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

    public void swap(node n){
        if(n==null || n.next==null){
            System.out.println(n);
        }
        node current = n;

        while(current != null && current.next!= null){
            int temp = current.data;
            current.data = current.next.data;
            current.next.data=temp;

            current=current.next.next;
        }

        node temp = n;
        while (temp!=null){
            System.out.println(temp.data);
            temp= temp.next;
        }


    }



    // reverse the linked list in every k nodes of a linked list
    public node Reversek(node head, int k){
        if(head == null){
            return null;
        }
        node current = head;
        node next= null;
        node prev = null;
        int count=0;

        while(count < k && current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }
        if(next != null)
            head.next = Reversek(next,k);

        return prev;
    }


    // to display the data
    public void display(node head){
        if (head== null){
            System.out.println("empty");
        }

        node temp = head;
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
        node fourth = new node(5);
        node fifth = new node(6);

        head.next = first;
        first.next = second;
        second.next = third;
        third.next = fourth;

        fourth.next=fifth;
        fifth.next= null;

        SwapInPairs sp = new SwapInPairs();
//         sp.swap(head);

    node temp = sp.Reversek(head , 3);
    sp.display(temp);


    }
}
