package Array;


/*
calculate he sums of wo number in the array and return the index of ha sub array

ex:
arr = 1 2 3 4 5
    find sum = 9
print  3 and 4
 */
public class TwoSum {

    public int[] indexes(int[] arr,int total){
        int sum;
        int[] a = new int[2];

        for(int i =0;i<arr.length;i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == total - arr[i]) {
                    a[0] = i;
                    a[1] = j;
                    return a;
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int[] a={1,2,7,3,4};
        TwoSum s = new TwoSum();

        int[] b=s.indexes(a,9);

        for(int c : b){
            System.out.println(c);
        }
    }

}
