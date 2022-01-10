package Assignment4;
import java.util.Scanner;
// 2. [Define a program to find out whether a given number is even or odd.](https://www.geeksforgeeks.org/java-program-to-check-if-a-given-integer-is-odd-or-even/)


public class Q2 {
    public static boolean evencheck(int num) {
    if (num%2==0) {
        return true;
    } else {
        return false;
    }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num =in.nextInt();
        boolean result=evencheck(num);
        if (result) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
        in.close();
    }
}
