package Array;

public class MedianofTwoSortedArray {

    public double findMedianSortedArrays(int[] num1, int[] num2) {

        int[] arr = new int[num1.length+num2.length];
        int j=0;
        int k=0;
        int i=0;

        while(i<num1.length && j<num2.length){
            if(num1[i]>num2[j]){
                arr[k]=num2[j];
                j++;
            }
            else{
                arr[k]=num1[i];
                i++;
            }
            k++;
        }

        while(i<num1.length-1){
            arr[k]=num1[i];
            i++;
            k++;
        }

        while(j<num2.length-1){
            arr[i]=num2[k];
            i++;
            k++;
        }

        double meadian = (arr.length)/2;
        int a = (int)meadian;
        System.out.println(arr[(int) meadian]);
        System.out.println(arr[(int) meadian+1]);
        double value = arr[a]+(meadian-(double)a)*(arr[a]-arr[a-1]);

        return value;
    }

    public static void main(String[] args) {
        int [] arr1 ={1,3};
        int[] arr2 ={2,5};

        MedianofTwoSortedArray  m = new MedianofTwoSortedArray();
        System.out.println(m.findMedianSortedArrays(arr1,arr2));
    }

}