package DataStructureImplementation;


import java.util.Scanner;


/*
Arrays are the collection of similar data types having fixed size.
Array can be single , double to multidimensional.

The idea is to store different data's of same kind so that it can be identified easily when required.

It can be of any data Types like
1. Integer
2. Long
3. Float
4. Double
5. char
6. String

operations:
1. insertion
2. deletion

advantages
1. ordered
2. helps to identify elements easily

Disadvantages
1. Fixed size
2. Wastage of memory which is allocated but not used.
 */


public class Arrays
{
    int[] arr= new int[100];
    protected static Scanner sc = new Scanner(System.in);

    //to insert the element in array.
    void insert(int[] arr,int n){
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
    }

    //to display the element present in array
    void display(int[] arr,int n){
        System.out.println("Array: ");
        for(int i=0; i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

    // to delete element from the array
    void delete(int[] arr, int index){
        for(int i=index;i<index+1;i++){
            arr[index]=arr[i+1];
        }

    }



    public static void main(String[] args) {
        Arrays a = new Arrays();
        int n;
        System.out.print("Enter the number of element to insert in array: ");
        n=sc.nextInt();

        a.insert(a.arr, n);
        a.display(a.arr, n);

        // to delete the element in array.
        int index;
        System.out.print("Enter the index to delete: ");
        index=sc.nextInt();

        a.delete(a.arr, index);
        a.display(a.arr, n-1);
    }
}
