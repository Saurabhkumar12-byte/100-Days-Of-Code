package Assignment4;
import java.util.Scanner;
// 7. [Define a method to find out if a number is prime or not.](https://www.geeksforgeeks.org/java-program-to-check-if-a-number-is-prime-or-not/)
public class Q7 {
    private static boolean isPrime(int num) {
        for (int i = 2; i <= num/2; i++) {
            if (num%i==0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num=in.nextInt();
        System.out.println(isPrime(num));
        in.close();
    }
}
