// 21. Fibonacci Series In Java Programs
package Assignment3;

import java.util.Scanner;

public class Q21 {
    public static int fibo(int term) {
        if (term == 2 || term == 3) {
            return 1;
        } else {
            return fibo(term - 1) + fibo(term - 2);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the position at which you want the term in fibonacci series");
        int term = in.nextInt();
        System.out.println(fibo(term));
        in.close();
    }
}
