package Assignment4;
// 1. Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
import java.util.Scanner;
public class Q1 {
    public static int largest(int a ,int b,int c) {
        if (a>b) {
            if (a>c) {
                return a;
            }
            return c;
        }
        boolean large= b>c;
        if (large) {
            return b;
        } else {
            return c;
        }
    }
    public static int smallest(int a ,int b,int c) {
        if (a>b) {
            if (c>b) {
                return b;
            }
            return c;
        }
        boolean large= a<c;
        if (large) {
            return a;
        } else {
            return c;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(largest(1,4 ,3));
        System.out.println(smallest(1,4 ,3));
        in.close();
    }
}
