package Array;

public class MInimalLengthSubarray {
    public int minlength(int[] arr , int target){
        int sum=0;
        int count =0;
        int count2=0;
        for(int i=0;i<arr.length;i++){
           sum = arr[i];
            if(sum == target){
                return 1;
            }
            for(int j=i+1;j<arr.length;j++){
                sum =0;
                for (int k=i;k<=j;k++){
                    sum +=arr[k];
                    count++;
                    if(sum== target && count2<count){
                        count2 = count;
                    }
                }
            }
        }

        return count2;

    }

    public static void main(String[] args) {
        int[] arr = {5,2,3,4,6,11};

        MInimalLengthSubarray ms = new MInimalLengthSubarray();

        int m = ms.minlength(arr,10);
        System.out.println(m);
    }
}
