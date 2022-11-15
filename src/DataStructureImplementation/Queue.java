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
1. They are both flexible and fast.
2. Queues can be of potentially infinite length compared with the use of fixed-length arrays

Disadvantages
1. Queue is that a new element can only be inserted when all the elements are deleted from the queue.
2. Linear Queue has memory wastage problem.


 */
public class Queue {
    protected static Scanner sc = new Scanner(System.in);

    private int size =10;
    private int[] Arr = new int[size];

    private int Rear=-1;
    private int Front=-1;

 public void Enqueue(){

     if(Rear==size-1){
         System.out.println("Queue Overflow");
     }
     else {
         System.out.println("Enter the Data");
         int data = sc.nextInt();
         if(Front==-1 && Rear==-1){
             Front=0;
             Rear=0;
         }
         else {
             Rear = Rear+1;
             Arr[Rear]=data;
         }
     }
 }
 public void Dequeue(){
     Front = Front+1;
     if(Rear==-1){
         System.out.println("Trying to Delete from Empty Queue");
     }
 }

 public void display(){
     System.out.println("The elements in the Queue are: ");
     for(int i=Front;i<=Rear;i++){
         System.out.println(Arr[i]);
     }
 }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.Enqueue();
        q.Enqueue();
        q.Enqueue();
        q.Dequeue();
        q.display();
    }

}
