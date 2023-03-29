package LinkedList;

public class MergeTwoSortedList {
    static class node{
        int data;
        node next;
        public node(int data){
            this.data = data;
            this.next=null;
        }
    }
    node head;

    public node merge(node l1,node l2){
        node dummy = new node(0);
        node temp = dummy;

        while(l1!=null && l2!=null){
            if(l1.data>l2.data){
                temp.next=l2;
                l2=l2.next;
            }
            else{
                temp.next=l1;
                l1=l1.next;
            }
        }
        if(l1!=null){
            temp.next=l1;
        }
        if(l2 !=null){
            temp.next=l2;
        }

        return dummy.next;
    }

    public void display(node head){
        if(head == null){
            return;
        }

        node current = head;

        while(current!=null){
            System.out.println(current.data);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        node head1= new node(1);
        node first = new node(3);
        node second = new node(5);
        node third = new node(7);

        head1.next = first;
        first.next = second;
        second.next = third;


        node head2= new node(2);
        node first2 = new node(4);
        node second2 = new node(6);
        node third2 = new node(8);

        head2.next = first2;
        first2.next = second2;
        second2.next = third2;


        MergeTwoSortedList mg = new MergeTwoSortedList();
        node newhead = mg.merge(head1,head2);

        mg.display(newhead);

    }

}
