/**
 * factorsOptimised
 */
public class factorsOptimised {

    public static void main(String[] args) {
        int n=100;
        boolean[] arr=new boolean[n+1];
        for (int i = 1; i*i <= n; i++) {
            if(n%i==0) {
                int div=n/i;
                arr[i]=true;
                arr[div]=true;
            }
        }
        for (int i = 1; i < n+1; i++) {
            if(arr[i]) {
                System.out.println(i);
            }
        }

    }
}