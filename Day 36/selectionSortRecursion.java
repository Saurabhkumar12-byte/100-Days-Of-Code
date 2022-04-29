import java.util.Arrays;

public class selectionSortRecursion {
    public static void main(String[] args) {
        int arr[]={3,2,5,8,1,9,0};
        selection(arr,0,1);
        System.out.println(Arrays.toString(arr));
    }
    public static void selection(int[] arr,int i,int j) {
        if(i==arr.length-1){
            return;
        }
        if (j<arr.length) {
            if (arr[i]>arr[j]) {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            selection(arr, i, j+1);
        } else {
            selection(arr, i+1, i+2);
        }
    }
}
