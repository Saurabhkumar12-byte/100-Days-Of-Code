package Assignment4;

import java.util.Scanner;

// 13. [Write a function that returns all prime numbers between two given numbers.](https://www.geeksforgeeks.org/program-to-find-prime-numbers-between-given-interval/)
public class Q13 {
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
        int start = in.nextInt();
        int end = in.nextInt();
        for (int i = start; i < end+1; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }

        }
        in.close();
    }
}
