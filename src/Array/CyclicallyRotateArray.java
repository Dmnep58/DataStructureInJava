package Array;
/*
                        TO rotate the array cyclically one by one
Approach:
Firstly make a new array equal size of the present array and copy the last index if the first array
Now copy all the array from index one to size -1.
and continue the step until the asked value is not satisfied  with the help of the 3 array.
 */
public class CyclicallyRotateArray {

    public void RotateArray(int[] arr,int size){
      int[] b= new int[size];


      b[0]=arr[size-1];
      int j=1;

      for(int i=0;i<size-1;i++){
          b[j++]=arr[i];
      }

      for(int i=0;i<size;i++){
          arr[i]=b[i];
      }
        for(int i=0;i<size;i++){
            System.out.print(arr[i]);
        }

    }

    public static void main(String[] args) {
        CyclicallyRotateArray c= new CyclicallyRotateArray();

        int[] arr= {1,2,3,4,5,6};

        c.RotateArray(arr,arr.length);
        System.out.println();
        c.RotateArray(arr,arr.length);
    }
}
