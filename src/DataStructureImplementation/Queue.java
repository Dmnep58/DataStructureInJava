package DataStructureImplementation;

import java.util.Scanner;
/*
Queue is a  linear  Data structure based on the FiFO (First in First Out) principle that is open in both sides.

The insertion end is called Rear end.
The deletion end is called Front end.

Operations on Queue
1. Enqueue.
2. Dequeue.
3. peek.
4. isFull.
5. isEmpty.


Types of Queues
1. Linear Queue.
2. Circular Queue.


Implementation:
1. Using Array.
2. Using Linked List.

Advantages.
1. They are both flexible and flexibility and fast.
2.queues can be of potentially infinite length compared with the use of fixed-length arrays

Disadvantages
1. queue is that a new element can only be inserted when all of the elements are deleted from the queue.


 */
public class Queue {
    protected static Scanner sc = new Scanner(System.in);

    private int size =10;
    private int[] Arr = new int[size];

    private int Rear;
    private int Front;


}
