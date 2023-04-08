package Array;
/*
              TO compare an array and reverse array and find the count of bigger number compares both indexes
              starting from 0 to n of both and number can be grater in any array should be counted.

 Time Complexity: O(n) in best case O(n^2) in worst case
 space complexity: O(1)
 */

public class MaximumGreatness{
    public int maxGreatness(int[] arr,int size){
        int[] b = new int[arr.length];
        System.arraycopy(arr, 0, b, 0, arr.length);

        int k;
        for(int i=1;i<size;i++){
            k=arr[i];

            int j=i-1;

            while(j>=0 && arr[j]>k){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]= k;
        }
        int count =0;
        int count1 =0;
        for(int l =0;l<size;l++){
            if(b[l]>arr[l]){
               count++;
            }
            if(b[l]==arr[l]){
                continue;
            }
            if(b[l]<arr[l]){
                count1++;
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");

        }
        System.out.print("\n");
        for(int n=0;n<arr.length;n++){
            System.out.print(b[n]+" ");
        }

        System.out.println();
        System.out.println(count1+" "+count);
        return count+count1;
    }

    public static void main(String[] args) {
        int[] arr ={6,1,2,6,3,2,1};
        MaximumGreatness m = new MaximumGreatness();
        System.out.println( m.maxGreatness(arr,arr.length));

    }
}
