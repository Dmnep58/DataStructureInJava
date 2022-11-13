package LinkedList;

/*
                            Delete the middle element of the linked list
Approach:

Find the middle of the linked list
let the middle be is pointed by the current pointer
associate it's previous with previous pointer and next with the temp pointer
then just connect the previous next direct to temp Or it can be also done by using 2 pointers
just changing hte previous next ot current next

Time complexity: O(n)
Space Complexity: O(1)

 */
public class DeleteMiddleNode {

    public static class node{
        private  int data;
        private  node next;

        node(int data){
            this .data= data;
            this.next= null;
        }
    }
    private  static  node head;

    public void AddData(int data){
        node current = new node(data);
        if(head == null){
            head = current;
        }
        node temp = head;
        while(temp.next!= null){
            temp = temp.next;
        }
        temp.next=current;
        current.next=null;
    }

    public void FindMiddle(){
        if(head==null){
            System.out.println("linked list is empty ");
        }
        node slow = head;
        node fast = head;
        node previous = null;
        while(fast!=null && fast.next !=null){
            previous = slow;
            slow= slow.next;
            fast=fast.next.next;
        }
        previous.next=slow.next;
    }

    public void display(){
        if(head== null){
            System.out.println("Linked list is empty");
        }
        node current = head;
        while (current!= null){
            System.out.print(current.data+"-->");
            current=current.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        DeleteMiddleNode d = new DeleteMiddleNode();
        d.AddData(1);
        d.AddData(2);
        d.AddData(3);
        d.AddData(4);
        d.AddData(5);
        d.AddData(6);
        d.display();

        d.FindMiddle();
        d.display();
    }
}
