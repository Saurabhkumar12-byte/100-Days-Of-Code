import java.util.Arrays;
import java.util.Scanner;
/**
 * countSort
 */
public class countSort {

    public static void main(String[] args) {
        int[] arr= new int[5];
        Scanner in = new Scanner(System.in);
        for (int i : arr) {
            arr[i]=in.nextInt();
        }
        in.close();
        count(arr, 5);
        System.out.println(Arrays.toString(arr));
    }

    private static void count(int[] arr, int n) {
        int [] a= new int[n+1];
        for (int i : a) {
            a[i]=0;
        }
        for (int i = 0; i < arr.length; i++) {
            a[arr[i]]++;
        }
        int i=0,j=0;
        while (i<a.length) {
            while (a[i]!=0) {
                arr[j]=i;
                a[i]--;
                j++;
            }
            i++;
        }
    }
}