package DataStructureImplementation;

import java.util.Scanner;

/*
The circular linked list is a linked list where all nodes are connected to form a circle.
In a circular linked list, the first node and the last node are connected to each other which forms a circle. \
There is no NULL at the end.

Types:
1. Circular Singly Linked List                 last(1)-->2-->3-->4-->last(1)
2. Circular Doubly Linked List                 last(1)<-->2<-->3<-->4<-->last(1)


Approach:

This is the approach of the single circular linked-list
Double circular linked-list can be implemented just by adding a reference to previous node.

The circular linked list is implemented by using last node.
Insertion of data takes place from the last node and have the reference of first node of the list.
so, that last nodes next node is the first node .


Advantages.
1. Any node can be a starting point. We can traverse the whole list by starting from any point
2. Circular Doubly Linked Lists are used for the implementation of advanced data structures like the Fibonacci Heap.

DisAdvantages
1. Compared to singly linked lists, circular lists are more complex.
2. It is possible for the code to go into an infinite loop if it is not handled carefully.
3. It is harder to find the end of the list and control the loop.



 */
class CircularLinkedList {
    protected static Scanner sc = new Scanner(System.in);

    class listnode {
        private int data;
        private listnode next;

        listnode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // instead of inserting from the head node we start to insert data from the
    // last node.
    private listnode last;

    // to insert the data in the circular linked list
    void InsertData() {
        int data;
        System.out.print("Enter the data: ");
        data = sc.nextInt();

        listnode current = new listnode(data);

        if (last == null) {
            last = current;
        } else {
            current.next = last.next;
        }
        last.next = current;
    }

    // to display the linkedlist
    void DisplayLinkedList() {
        // check last node is null or not
        if (last == null) {
            System.out.println("linked list is null");
            return;
        }

        listnode current = last.next; // point current node to last's next

        while (current != last) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.println(current.data + "-->reference to last node-->"+current.next.data);
    }

    // to delete node from the head node.
    private void Delete_Node() {
        if (last == null) {
            System.out.println("Linked list is empty");
            return;
        }

        if (last.next == null) {
            last = null;
        } else {
            listnode temp = last.next;
            last.next = temp.next;
            temp = null;
        }

    }

    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();

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
                    cll.InsertData();
                    ;
                    break;

                case 2:
                    cll.Delete_Node();
                    break;

                case 3:
                    cll.DisplayLinkedList();
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

