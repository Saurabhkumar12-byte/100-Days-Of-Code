import java.util.Arrays;

public class mergeSortInPlace {
    public static void main(String[] args) {
        int arr[]={6,3,9,5,1};
        divide(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
        
    }
    public static void divide(int[] arr, int s, int e) {
        
        if (e-s==1 ) {
            return;
        }
        int m=(s+e)/2;
        divide(arr, s, m);
        divide(arr, m,e);
        conquer(arr, s,m,e);
    }
    public static void conquer(int[] arr, int s, int m, int e) {
        int i=s;
        int j=m;
        int k=0;
        int []merge=new int[e - s];
        while (i<m && j<e) {
            if (arr[i]<arr[j]) {
                merge[k]=arr[i];
                i++;
                
            } else {
                merge[k]=arr[j];
                j++;
               
            }
            k++;
        }
        while (i<m) {
            merge[k]=arr[i];
            k++;
            i++;
        }
        while (j<e) {
            merge[k]=arr[j];
            k++;
            j++;
        }
        for (int l = 0; l < merge.length; l++) {
            arr[s+l]=merge[l];
        }
    }
}
