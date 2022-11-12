package LinkedList;
/*
                                Remove Duplicate Elements from the Sorted linked list
Approach
Just check the element next to the current node and
if the element is same as the current element then
just change the link of the current element to current next to next
which will helps to remove the node having the duplicate element.

Time complexity: O(n)
Space complexity: O(1)
 */
public class RemoveDuplicates {
    public static class node{
        private int data;
        private node next;
        node(int data){
            this.data=data;
            this.next=null;
        }
    }
    private static node head;;

    //Add node in the linked list
    public void AddNode(int data){
        node current = new node(data);
        if(head== null){
            head=current;
        }
        node temp = head;
        while(temp.next!=null){
           temp =temp.next;
        }
        temp.next=current;
        current.next=null;

    }

    //Remove Duplicate elements in the linked
    public void DuplicateElement(){
        if(head==null){
            System.out.println("linked list is empty");
        }
        node current = head;
        while(current.next != null){
            if(current.data == current.next.data){
                current.next=current.next.next;
            }
            else {
                current=current.next;
            }
        }
    }

    //to display the elements present in the linked list
    public void display(){
        if(head==null){
            System.out.println("linked list is empty");
        }
        node current = head;
        while(current!=null){
            System.out.print(current.data+"-->");
            current=current.next;
        }
        System.out.println("NUll");
    }

    public static void main(String[] args) {
        RemoveDuplicates r = new RemoveDuplicates();

        r.AddNode(1);
        r.AddNode(2);
        r.AddNode(2);
        r.AddNode(3);
        r.AddNode(4);
        r.display();

        r.DuplicateElement();
        r.display();

    }
}
