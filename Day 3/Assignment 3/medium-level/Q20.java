import java.util.Scanner;

// 20. HCF Of Two Numbers Program
public class Q20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        while (b%a!=0) {
            int rem=b%a;
            b=a;
            a=rem;
        }
        System.out.println(a);
        in.close();
    }
}
