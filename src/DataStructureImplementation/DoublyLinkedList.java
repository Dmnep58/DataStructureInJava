package DataStructureImplementation;
import java.util.Scanner;

/*
Doubly Linked-list consists of both way address reference ie. one node has address of its next and next has the address of the previous node.

1 <--> 2 <--> 3 <--> 4 <--> Null

Create two nodes address references inside the inner class.
add a back pointer to its previous node .

Advantages:
1. Reverse Traversal is easy.
2. It can allocate or reallocate memory easily during its execution.
3. Deletion of nodes is easy as compared to a Singly Linked List

Disadvantages:
1. It uses extra memory when compared to the array and singly linked list.
2. Since elements in memory are stored randomly, therefore the elements are accessed sequentially no direct access is allowed.
 */

class DoublyLinkedList {
    protected static Scanner sc = new Scanner(System.in);

    class listnode {
        private int data;
        private listnode next;
        private listnode previous;

        listnode(int data) {
            this.data = data;
            this.next = null;
            this.previous = null;
        }
    }

    private listnode head; // head node created.
    private listnode tail; // tail node created.

    // to insert data in the linked-list.
    void InsertDate() {
        int data;
        System.out.print("Enter the data:");
        data = sc.nextInt();

        listnode current = new listnode(data); // created a node

        // check head node is empty or not
        if (head == null) {
            head = tail = current;
            head.previous = null;
            head.next = null;
        } else {
            tail.next = current;
            current.previous = tail;
            tail = current;
        }

    }

    // to delete the first node present in the linked list
    void Delete_Node() {

        if (head == null) {
            System.out.println("Linkedlist is empty: ");
            return;
        }
        if (head != null) {
            if (head.next == null) {
                head = null;
            } else {
                head = head.next;
                head.previous = null;
            }
        }
    }

    // to display the linked list
    void display_list() {
        if (head == null) {
            System.out.println("Null");
            return;
        }

        listnode current = head;
        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

        int choice;

        while (true) {
            System.out.println("--------Doubly Linked listed Simple  Menu Driven Program------------");
            System.out.println("1. Insert into linked list ");
            System.out.println("2. Delete head node from linked list ");
            System.out.println("3. Display the linked list ");
            System.out.println("4.Exit");
            System.out.print("Enter the choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    dll.InsertDate();
                    ;
                    break;

                case 2:
                    dll.Delete_Node();
                    break;

                case 3:
                    dll.display_list();
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
