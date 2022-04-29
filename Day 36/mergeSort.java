import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.println(Arrays.toString(divide(arr)));
    }
    public static int[] divide(int[] arr) {
        if (arr.length==1) {
            return arr;
        }
        int m=arr.length/2;
        int []first=divide(Arrays.copyOfRange(arr, 0, m));
        int []second=divide(Arrays.copyOfRange(arr, m,arr.length));
        return conquer(first,second);
    }
    public static int[] conquer(int[] first,int[] second) {
        int i=0;
        int j=0;
        int k=0;
        int []merge=new int[first.length+second.length];
        while (i<first.length && j<second.length) {
            if (first[i]<second[j]) {
                merge[k]=first[i];
                i++;
                k++;
            } else {
                merge[k]=second[j];
                j++;
                k++;
            }
        }
        while (i<first.length) {
            merge[k]=first[i];
            k++;
            i++;
        }
        while (j<second.length) {
            merge[k]=second[j];
            k++;
            j++;
        }
        return merge;
    }
}
