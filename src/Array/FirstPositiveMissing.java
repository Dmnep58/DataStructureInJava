package Array;

public class FirstPositiveMissing {
    public int firstMissingPositive(int[] nums) {
        int n= nums.length;

        int[] b = new int[n];

        for(int i=0;i<n;i++){
            int element = nums[i];

            if(element >= 1 && element <= n){
                int chair = element-1;
                b[chair] =nums[i];
            }
        }

        for (int a :b
             ) {
            System.out.println(a);
        }

        System.out.println("break");
        for(int i=0;i<nums.length;i++){

            if( i+1 != b[i])
            {
                return  i+1;

            }
        }

        //if no one is missing then return the next element after the array last index
        return n+1;
    }

    public static void main(String[] args) {
        int[] arr = {3,4,-1,1};

        FirstPositiveMissing fp = new FirstPositiveMissing();

        System.out.println(fp.firstMissingPositive(arr));
    }
}
