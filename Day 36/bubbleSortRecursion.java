import java.util.Arrays;

public class bubbleSortRecursion {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,8,7};
        bubble(arr,0,0);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubble(int[] arr,int i,int j) {
        if (i==arr.length-1) {
            return;
        }
        if (j<arr.length-1-i) {
            if (arr[j]>arr[j+1]) {
                int temp=arr[j+1];
                arr[j+1]=arr[j];
                arr[j]=temp;
            }
           bubble(arr, i, j+1);
        }
        else{
            bubble(arr, i+1, 0);
        }
        
    }
}
