package Problems;


public class AscendingBinarySorting {

    public static int countBits(int number){

        if(number ==0){
            return number;
        }
        int count=0;
        while(number!=0){
            number &= (number-1);
            count++;
        }
        return count;
    }
    public static void rearrange(int[] arr){
        int n=arr.length;
        System.out.println(n);

        int[] c = new int[arr.length];
        int k=0;

        System.out.println("copying to sort the array");
        for(int i=0;i<arr.length;i++){
            if(countBits(arr[i])==2){
                c[k++]=arr[i];
                arr[i]=0;
            }
        }

        for (int a:c) {
            System.out.println(a);
        }


        System.out.println("Copy the reamaining element");
        for(int i=0;i<k-1;i++){
           if(c[i]>c[i+1]){
               int temp = c[i];
               c[i] = c[i+1];
               c[i+1] = temp;
           }
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i] != 0){
                c[k++] = arr[i];
            }
        }

        for (int a:c) {
            System.out.println(a);
        }

    }

    public static void main(String[] args) {
        int[] a= {5,3,7,10,14};

        AscendingBinarySorting as = new AscendingBinarySorting();

        as.rearrange(a);

    }
}
