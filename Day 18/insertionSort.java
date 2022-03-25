import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int[] arr={2,8,3,1,7};
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[j]>arr[i]) {
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
