import java.util.*;
/**
 * Armstrong
 */
public class Armstrong {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int temp=n;
        int sum=0;
        while (n!=0) {
            int rem=n%10;
            sum=sum+(rem* rem*rem);
            n=n/10;
        }
        in.close();
        if (temp==sum) {
            System.err.println("true");;
            
        }
        else{
            System.out.println("false");;
        }
        
    }
}