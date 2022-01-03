// 23. Input a number and print all the factors of that number (use loops).

import java.util.Scanner;

/**
 * Q23
 */
public class Q23 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num= in.nextInt();
        for (int i = 1; i <=num/2; i++) {
            if (num%i==0) {
                System.out.println(i);
            }
        }
        in.close();
    }
}