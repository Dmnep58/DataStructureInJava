package Array;
/*
            Move all the negative elements to one side of the array
Copy the negative element in another array and non-negative in another.
Now merge the arrays and print the desired result.
 */
public class MoveNegativeElement {
    public void MoveNegElement(int[] arr,int size){
        int[] neg,pos;
        int count=0;
        for(int i=0;i<size;i++){
            if(arr[i]<0){
                count++;
            }
        }

        neg = new int[count];
        pos = new int[size-count];
        int j =0;
        int k=0;
        for(int i=0; i<size;i++){
            if(arr[i]<0){
                neg[j]=arr[i];
                j++;
            }
            else{
                pos[k]=arr[i];
                k++;
            }
        }
        int arrlen=0;
        for(int i=0;i<pos.length;i++){
            arr[arrlen]=pos[i];
            arrlen++;
        }

        for (int i=0;i<neg.length;i++){
            arr[arrlen]=neg[i];
            arrlen++;
        }
    }

    public static void main(String[] args) {
        MoveNegativeElement m = new MoveNegativeElement();

        int[] arr={1,-2,-4,2,3,-5,-43,9,8,7,-93};

        m.MoveNegElement(arr, arr.length);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
