/**
 * reverseRecurrsive
 */
public class reverseRecurrsive {
    static int sum =0;
    public static void reverse(int n) {
        if(n==0){
            return;
        }
        int rem=n%10;
        n=n/10;
        sum=sum*10+rem;
        reverse(n);
    }
    public static void main(String[] args) {
        reverse(1234);
        System.out.println(sum);
    }
    
}