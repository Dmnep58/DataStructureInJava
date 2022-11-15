package DataStructureImplementation;

import java.util.Scanner;

/*
Stack is a Data structure based on the principle of lifo(Last in first out)
The first element in the stack is known as the Top element.

operations:
1. push -- insert the element in the stack
2. pop -- delete the element from the stack
3. peek -- display the top element without delete it.

Implementation:
It can be implemented by :
1. Using Array
2. Using LinkedList

Advantages:
1. Does not allow resizing of variables
2. Stack does not get corrupted easily; hence it is more secure and reliable
3. Easy to use and implement.


Disadvantages
1. Stack memory is very limited.
2. The stack will fall outside the memory area, which might lead to an abnormal termination.
3. In a stack, random accessing the data is not possible.

 */


class stacks{
    protected static Scanner sc = new Scanner(System.in);

    static int size = 10;
    int[] Arr = new int[size]; // Declared and intialized the array.
    int top; // top element.

    stacks(){
        this.top=-1;
    }

    // to push the data in the stack
    void PushData(){
        int Data;
        System.out.print("Enter the Data: ");
        Data = sc.nextInt();

        if(top > size-1){
            System.out.println("Stack Overflow ");
        }
        else{
            top++;
            Arr[top]=Data;
        }
    }

    //to delete the data from stack
    void PopData(){
        if(top == -1){
            System.out.println("Stack Underflow");
            return;
        }
        top --;
        System.out.println(Arr[top]);
    }

    //to display top most element
    void peek(){
        System.out.println(Arr[top]);
    }

    // to display the elements in the stack

    void DisplayStack(){
        if(top == -1){
            System.out.println("Stack Underflow ");
            return;
        }
        else{
            for(int i=top ;i>=0; i--){
                System.out.println(Arr[top]);
            }
        }
    }

    public static void main(String[] args) {
        stacks s = new stacks();

        int choice;

        while(true){
            System.out.println("----Simple push and pop operation in stack------");
            System.out.println("1. push");
            System.out.println("2. pop");
            System.out.println("3. peek");
            System.out.println("4. Display");
            System.out.print("Enter  your choice: ");
            choice = sc.nextInt();

            switch(choice){
                case 1:
                    s.PushData();
                    break;

                case 2:
                    s.PopData();
                    break;

                case 3:
                    s.peek();
                    break;

                case 4:
                    s.DisplayStack();
                    break;

                default:
                    System.out.println("Enter the correct choice: ");

            }

        }
    }



}
