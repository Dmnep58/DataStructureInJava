package LinkedList;
/*
                        Find the nth node from the end of the linked list

Approach:
First count the number of nodes present in the linked list
know run the loop till count becomes equal to the count of the node required by (count - value) from end
Print that node.
 */
public class nodeEnd {

    public static class listnode{
        private int data;
        private listnode next;
        public  listnode(int data){
            this.data=data;
            this.next=null;
        }
    }

    private static listnode head;

    public int FindNode(int node){
        listnode current = head;
        int count=0;

        while(current!= null){
            count++;
            current=current.next;
        }
        current =head;
        for(int i=0;i<count-node;i++){
            current =current.next;
        }
        return current.data;
    }

    // display the linked list
    public void display(){
        listnode current = head;

        while(current!= null){
            System.out.print(current.data+" --> ");
            current=current.next;
        }
        System.out.println("Null");
    }
    public static void main(String[] args) {
        nodeEnd n = new nodeEnd();
        head = new listnode(1);
        listnode second = new listnode(2);
        listnode third = new listnode(3);
        listnode fourth = new listnode(4);
        listnode fifth = new listnode(5);

        head.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;
        fifth.next=null;

        n.display();

        System.out.println(n.FindNode(3));

    }
}
