import java.util.Arrays;

public class quickSort {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        sort(arr,0,(arr.length-1),0,(arr.length-1));
        System.out.println(Arrays.toString(arr));
    }
    private static void sort(int[] arr,int low,int hi, int s, int e) {
        if(low>=hi){
            return;
        }
        int m =s+(e-s)/2;
        int p=arr[m];
        while (s<=e) {
            while (arr[s]<p) {
                s++;
            }
            while (arr[e]>p) {
                e--;
            }
            if (s<=e) {
                int temp=arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                s++;
                e--;
            }
        }
        sort(arr,low,e,low,e);
        sort(arr,s,hi,s,hi);
    }
}
