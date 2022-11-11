package LinkedList;

/*
                    TO Reverse a linked list

Approach:
        we can reverse the linked list using 3 pointers
lets say current previous and the temp pointer
firstly make the previous pointer null and  current pointer equal to head and temp next of the current
assign the current next to previous and make previous as current
assign the current to temp
Run this loop until the current becomes empty and assign the head to previous at last
Because previous will be holding the first node of the reversed list.

Time complexity : O(n)
Space complexity : O(1)
 */
public class ReverseLinkedList {

    public static class listnode{
        private final int data;
        private listnode next;

        listnode(int data){
            this.data= data;
            this.next= null;
        }
    }
    private static listnode head;

    //Reverse function
    public listnode Reverselist(){
        if(head == null){
            System.out.println("Linked list is empty ");
        }

        listnode previous=null;
        listnode current = head;
        listnode temp;

        while(current!=null){
            temp=current.next;
            current.next=previous;
            previous=current;
            current=temp;
        }
        head=previous;

        return head;
    }

    //display function
    public void  display(){
        if(head==null){
            System.out.println("linked list is empty");
            return;
        }

        listnode current = head;
        while(current != null){
            System.out.print(current.data+" -->");
            current=current.next;
        }
        System.out.println("NUll");
    }

    public static void main(String[] args) {
        ReverseLinkedList r = new ReverseLinkedList();
        head= new listnode(1);
        listnode second = new listnode(2);
        listnode third = new listnode(3);
        listnode fourth = new listnode(4);

        head.next = second;
        second.next=third;
        third.next=fourth;
        fourth.next=null;
        r.display();

        //reverse function call
        r.Reverselist();
        r.display();
    }
}
