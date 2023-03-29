package LinkedList;

public class PalindromeList {
    static class node{
        int data;
        node next;
        public node(int data){
            this.data = data;
            this.next = null;
        }
    }
    node head;

    public node MiddleElement(node element){
        if(element==null){
            return element;
        }
        node slow = element;
        node fast = element;

        if(slow.next!=null){
            while(fast!=null && fast.next!=null){
                slow = slow.next;
                fast=fast.next.next;
            }
        }
        return slow;
    }

    public node reverse(node element){
        node prev = null;
        node current = element;

        while(current!=null){
            current = current.next;
            element.next=prev;
            prev=element;
            element=current;
        }
        return prev;
    }

    public boolean palindrome(node head){
        if(head == null)
            return true;

        node middle = MiddleElement(head);
        node last = reverse(middle);
        node current = head;
        while(last!=null){
            if(last.data!=current.data){
                return false;
            }
            last = last.next;
            current=current.next;
        }
        return true;
    }

    public static void main(String[] args) {
        node head1= new node(1);
        node first = new node(2);
        node second = new node(1);
        node third = new node(1);

        head1.next = first;
        first.next = second;
        second.next = third;
        third.next=null;

        PalindromeList pl = new PalindromeList();
        System.out.println(pl.palindrome(head1));

    }

}
