package LinkedList;

 // Definition for singly-linked list.


public class RemoveNthNodeFromTheEnd {
    static class ListNode{
        int val;
        ListNode next;
        public ListNode(int val){
            this.val=val;
            this.next= null;
        }
    }

    ListNode head;

    public void list(int data){
        ListNode current = new ListNode(data);

        if(head== null){
            head= current;
        }
        else {
            current.next= head;
            head=current;
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode current = head;
        if(current==null){
            return head;
        }
        int count = 0;
        while(current!=null){
            count++;
            current=current.next;
        }
        if(count == 1){
            head = head.next;
            return head;
        }

        int i=0;
        ListNode curr= head;

        while(i<(count-n-1)){
            curr = curr.next;
            i++;
        }
        curr.next= curr.next.next;

        return head;

    }

    public void diplay(ListNode head){
        if(head!=null){
            ListNode current = head;
            while(current!=null){
                System.out.println(current.val);
                current = current.next;
            }
        }else{
            System.out.println("empty");
        }
    }

    public static void main(String[] args) {
        RemoveNthNodeFromTheEnd rm = new RemoveNthNodeFromTheEnd();

        ListNode head= new ListNode(12);
        ListNode first = new ListNode(13);
        ListNode second= new ListNode(14);
        ListNode third = new ListNode(15);

        head.next = first;
        first.next = second;
        second.next=third;
        third.next= null;
        System.out.println("before removal");
        rm.diplay(head);
        rm.removeNthFromEnd(head,2);
        System.out.println("After removal");
        rm.diplay(head);


    }

}
