package LinkedList;

public class RemoveLinkedListElement {
    static class node{
        int data;
        node next;
        public node(int data){
            this.data=data;
            this.next=null;
        }
    }

    node head;

    public void removeElement(node n,int val){


        node dummy = new node(-1);
        dummy.next= n;
        node current = dummy;


        if(current.data ==val && current.next == null ){
            head= null;
        }

        while(current.next!=null){
            if(current.next.data == val){
                current.next= current.next.next;
            }
           else  current = current.next;
        }

       node temp = dummy.next;
        while(temp!= null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        node head = new node(1);
        node first = new node(2);
        node third = new node(6);
        node fourth = new node(3);
        node fifth = new node(6);

        head.next= first;
        first.next=third;
        third.next=fourth;
        fourth.next=fifth;
        fifth.next=null;

        RemoveLinkedListElement rm = new RemoveLinkedListElement();
        rm.removeElement(head,6);
    }
}
