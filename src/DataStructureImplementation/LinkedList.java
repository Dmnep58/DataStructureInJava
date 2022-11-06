package DataStructureImplementation;

import java.util.Scanner;

/*
Linked-list is a linear Data structure  made up of one or more nodes.
Node contains the data and the pointer to the next node or address of the next node.
Dynamic allocation of memory.

Approach:
In Java linked-list is implement by using the inner class concept.

create outer class and initialize the head node by the help of the inner class wher the data variable , address of the next node is also intitalize and declared in the inner class.

1-->2-->3-->4-->5-->6-->Null;

Advantages:
1. Non-contiguous memory allocation
2. delete and insertion of any position without memory waste and fast
3. dynamically increase the memory node bounds of range.

Disadvantages
1. Extra memory for pointers.
2. Random Access.
 */

class LinkedList {
    protected static Scanner sc = new Scanner(System.in);

    // created the inner class for the node where data and reference to next node is initialized.
    static class Listnode{
        private int data;
        private Listnode next;
        Listnode(int data){
            this.data=data;
            this.next=null;
        }
    }
    private Listnode head; // first node of the linked-list (head node).

    //Insert data in the linked list
    void InsertData(){
        int data;
        System.out.println("Enter the data: ");
        data = sc.nextInt();
        Listnode current = new Listnode(data); // node created


        // check if the head node is empty or not.
        if(head == null){
            head=current;
            return;
        }
        Listnode temp = head;
        while(temp.next !=null){ // traverse to the last node
            temp=temp.next;
        }
        temp.next=current; //add the node
    }

    // to delete the head node
    void DeleteNode(){
        if(head==null){
            System.out.println("Linked List is empty. ");
        }
        head = head.next;
    }

    // to display all the nodes present in the list-node.
    void DisplayNodes(){
        Listnode current = head;
        while(current != null){
            System.out.print(current.data+"-->");
            current = current.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        LinkedList l = new LinkedList();

        int choice;

        while(true){
            System.out.println("--------Simple Linked listed Menu Driven Program------------");
            System.out.println("1. Insert into linked list ");
            System.out.println("2. Delete head node from linked list ");
            System.out.println("3. Display the linked list ");
            System.out.println("4.Exit");
            System.out.print("Enter the choice: ");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    l.InsertData();
                    break;

                case 2:
                    l.DeleteNode();
                    break;

                case 3:
                    l.DisplayNodes();
                    break;

                case 4:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Enter the correct choice: ");

            }
        }
    }
}
