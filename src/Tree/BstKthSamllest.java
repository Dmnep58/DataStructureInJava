package Tree;


/*
Find kth smallest element in a BST
 */

import javax.imageio.plugins.tiff.BaselineTIFFTagSet;
import java.util.Scanner;

public class BstKthSamllest {
    static  class tree{
        int data;
        tree left;
        tree right;

        public tree(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static int count = 0;

    protected  static Scanner sc = new Scanner(System.in);

    // insertion in the Binary search Tree
public static tree insert(tree root, int x){
    if(root == null){
        root = new tree(x);
        return root;
    }

    if (x < root.data){
       root.left =  insert(root.left,x);
    }
    else {
        if (x > root.data) {
            root.right = insert(root.right, x);
        }
    }
    return root;
}

// Function to find k'th smallest element in BST
// Here count denotes the number of nodes processed so far

public static tree Element(tree root , int k){

    // Base case
if(root == null){
    return null;
}

// search in the left subtree to find the kth element.
tree left = Element(root.left,k);

// find the element is found in left subtree

    if(left!=null)
        return left;

   // if it is the kth element then return it.

    count++;
    if(count== k){
        return root;
    }


// else search the element in the right subtree.
    return  Element(root.right,k);
}


// display the kth  smallest element
    public void display(tree root , int k){

    tree res = Element(root,k);

    if(res == null)
        System.out.println("no such element in the tree");
    else
        System.out.println("the kth  small element is: "+res.data);
    }


    // main function
    public static void main(String[] args) {
    BstKthSamllest b = new BstKthSamllest();

        tree root = null;

        int[] array = {20, 8 ,22 ,4, 12, 10, 14};

        for (int x : array)
           root =  b.insert(root,x);

        System.out.println("enter the smallest kth value ");
        int k = sc.nextInt();

        b.display(root,k);

    }

}
