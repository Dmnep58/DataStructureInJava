package LinkedList;
/*
            To find the middle node in a linked list
Approach:
        2 pointer approach is used to find the middle of the linked list
       fast pointer and slow pointer
  slow and faster pointer are initialized to head pointer move faster mover 2 time ahead then the slow pointer
  so that if faster pointer reaches its last index the slow pointer will be in middle of the list
 */
public class MiddleElement {

    static class listnode{
        private int data;
        private listnode next;

        listnode(int data){
            this.data= data;
            this.next= null;
        }
    }
    private static listnode head;

    public void FindMiddleNode(listnode head){
        listnode slow = head;
        listnode fast = head;

        if(slow.next != null){
            while (fast !=null && fast.next!=null){
                slow=slow.next;
                fast= fast.next.next;
            }
        }

        System.out.println(slow.data);
    }


    public static void main(String[] args) {

        listnode head = new listnode(1);
        listnode second = new listnode(2);
        listnode third= new listnode(3);
        listnode fourth = new listnode(4);
        listnode fifth= new listnode(5);
        listnode sixth = new listnode(6);

        head.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;
        fifth.next=sixth;
        sixth.next=null;

        MiddleElement m =new MiddleElement();
        m.FindMiddleNode(head);




    }
}


