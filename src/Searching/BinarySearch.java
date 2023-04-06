package Searching;

/*
Binary Search Algorithm

It is a type of searching Technique Which is based on Divide and compare.

Approach:
Divide the array into two halves
if the element is greater than the middle element then search in right half of the array
if not search in left array continue it until it find the key

if the key is not found the return -1;

Time Complexity: O(LogN)
 */
public class BinarySearch {     //Space Complexity: O(1)
    public int Search(int[] arr,int l,int h,int key){
        if(l>h){
            return -1;
        }

        while(l <= h){
            int mid =l+ (h-l)/2;

            if(arr[mid]==key)
                return mid;

            if(arr[mid]>key)
                h=mid-1;
            else
                l=mid+1;

        }
        return h;
    }

    //with recursion
    public int SearchRecursion(int[] arr,int l,int h,int key){      //Space Complexity: O(n)
        //Base Case
        if(l>h)
            return -1;

        while(h>=l){
            int mid =l+(h-l)/2;

            if(arr[mid]==key)
                return mid;

            if(arr[mid]>key)
               return  SearchRecursion(arr,l,mid-1,key);

               return  SearchRecursion(arr,mid+1,h,key);

        }
        return h;
    }

    public static void main(String[] args) {
        BinarySearch b = new BinarySearch();
        int[] arr={1,21,32,23,34,43,45,63,5534,55,2345};

        int d = b.Search(arr,0,arr.length-1,55);
        int e = b.SearchRecursion(arr,0, arr.length-1,63);

        System.out.println("1st element found at :"+d+" index");
        System.out.println("2nd element found at :"+e+" index");
    }

}
