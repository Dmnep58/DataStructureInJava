package LinkedList;

import java.util.Scanner;

public class CircularLinkedlist {

    class listnode{
        private int data;
        private  listnode next;

        public listnode(int data){
            this.data = data;
            this.next = null;
        }
    }

    // circular linked list contains the pointer from the both sides
    listnode head = null;
    listnode tail = null;

    protected  static Scanner sc = new Scanner(System.in);

    // insertion in the linked list from beginning
    public void InsertBeginning(){
        int data;
        System.out.println("Enter the data");
        data = sc.nextInt();

        listnode current = new listnode(data);

        // if the list-node is empty then mark the head and tail pointer to current node.
        if(head== null){
            head = current;
            tail=current;
            tail.next = head;  //pointing back to head
        }
        else{
            current .next = head;
            head = current;
            tail.next = head;  // assign the tail for the circular nature
        }
    }

    // insertion at the end of the list
    public void insertend(){
        int data;
        System.out.println("Enter the data");
        data = sc.nextInt();

        listnode current = new listnode(data);  //new node created

        // if list is empty
        if(head == null){
            head= current;
            tail = current;
            tail.next =current;
        }
        else{
            tail.next=current;
            tail = current;
            tail.next=head;
        }
    }

    //to insert the data at the specific position
    public void InsertAtAnyPosition(){
        int data;
        int position;  // position where the node will be inserted
        int count = 0; // to reach the position count will be used
        System.out.println("Enter the data: ");
        data = sc.nextInt();
        System.out.println("Enter the position: ");
        position = sc.nextInt();

        listnode current = new listnode(data);  //new node created

        // if list is empty
        if(head == null){
            System.out.println("List is empty so insertion can be performed");
        }

        listnode temp = head;
        for(int i=0; i<position-1; i++){
            temp = temp.next;
        }
        current.next=temp.next;
        temp.next = current;
    }

    //delete the element from the beginning of the list
    public void deletebe(){

        if(head == null){
            System.out.println("trying to delete element from the empty linked list");
        }

        listnode current  = head;
        current = current.next;
        head = current;
        tail.next= head;
    }


    // to display the data present in the linked list
    public void display(){
        listnode current = head;
        if(head == null){
            System.out.println("Linked list is empty");

        }
        else {

            //use the do while loop to run the traversal
            // it one times more than others so .
            do{
                System.out.print(current.data+"-->");
                current = current.next;
            }while(current != head);
            System.out.print(current.data);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        CircularLinkedlist circularLinkedlist = new CircularLinkedlist();

        while(true){
            int choice;
            System.out.println("1.insertion at beginning");
            System.out.println("2.insertion at end");
            System.out.println("3. insertion at specific position");
            System.out.println("4. Deletion at beginning");
            System.out.println("5.display");
            System.out.println("6.split");
            System.out.println("7. exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice){
                case 1:
                    circularLinkedlist.InsertBeginning();
                    break;
                case 2:
                    circularLinkedlist.insertend();
                    break;
                case 3:
                    circularLinkedlist.InsertAtAnyPosition();
                    break;
                case 4:
                    circularLinkedlist.deletebe();
                    break;
                case 5:
                    circularLinkedlist.display();
                    break;
                case 6:
//                    circularLinkedlist.split();
                    break;
                case 7:
                   System.exit(0);
                    break;
                default:
                    System.out.println("Enter the correct choice");
            }
        }
    }
}
