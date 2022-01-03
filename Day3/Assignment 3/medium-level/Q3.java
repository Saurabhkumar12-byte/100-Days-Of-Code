// package medium-level;
import java.util.Scanner;
// 3. Calculate Average Of N Numbers
public class Q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n=in.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int num= in.nextInt();
            sum += num;
        }
        System.out.println(sum/n);
        in.close();
    }
}
