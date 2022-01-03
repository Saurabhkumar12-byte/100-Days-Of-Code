import java.util.Scanner;

// 16. Find Ncr & Npr
public class Q16 {
    public static int fact(int n) {
        if (n==1) {
            return 1;
        } else {
            return n*fact(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter n and r");
        int n = in.nextInt();
        int r= in.nextInt();
        int npr=fact(n)/fact(r);
        int ncr=fact(n)/(fact(n-r)*fact(r));
        System.out.println("ncr is: "+ncr +" npr is: "+ npr);

        in.close();
    }
}
