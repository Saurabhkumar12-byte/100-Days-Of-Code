import java.util.Arrays;

public class CyclicSort {

    public static void main(String[] args) {
        int[] arr={3,1,2,5,4};
        for (int i = 0; i < arr.length-1; i++) {
            while (arr[i]!=i+1) {
               int temp=arr[arr[i]-1];
               arr[arr[i]-1]=arr[i];
               arr[i]=temp;

            }
        }
        System.out.println(Arrays.toString(arr));
    }
}