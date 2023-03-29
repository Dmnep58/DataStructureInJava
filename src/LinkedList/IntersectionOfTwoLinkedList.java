package LinkedList;
/*
Given the heads of two singly linked-lists headA and headB, return the node at which the two lists intersect.
 If the two linked lists have no intersection at all, return null.
 */
public class IntersectionOfTwoLinkedList {
    static class node{
        int data;
        node next;

        public node(int data){
            this.data = data;
            this.next = null;
        }
    }
    node head;
    public int intersection(node l1,node l2){
        node current = l1;
        int len1 = 0;
        if(l1 == null){
            len1=0;
        }
        while(current!=null){
            len1++;
            current=current.next;
        }

        node current1 = l2;
        int len2 =0;
        while(current!=null){
            len2++;
            current1=current1.next;
        }

        int diff = Math.abs(len2-len1);

        current=l1;
        current1=l2;

        while(diff-- >0){
            if(len1>len2){
                current=current.next;
            }
            else {
                current1 = current1.next;
            }
        }

        while(l1 != null && l2!=null){
            if(l1 == l2){
                return l1.data;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        node head1=new node(5);
        node first = new node(6);
        node second = new node(4);

        head1.next=first;
        first.next=second;

        node head2=new node(1);
        node first2 = new node(2);
        node second2 = new node(3);
        node third2 = new node(4);

        head2.next=first2;
        first2.next=second2;
        second2.next=third2;


        IntersectionOfTwoLinkedList i1 = new IntersectionOfTwoLinkedList();
        int a = i1.intersection(head1,head2);
        System.out.println(a);
    }
}
