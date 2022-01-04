package Assignment3;

// 27. Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.
import java.util.Scanner;

/**
 * Q27
 */
public class Q27 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nes = 0, pos = 0, pes = 0;
        int num=in.nextInt();
        while (num != 0) {
           
            if (num < 0) {
                nes += num;
            }
            if (num > 0 && num%2==0) {
                pes += num;
            }
            if (num > 0 && num%2!=0) {
                pos += num;
            }
            num = in.nextInt();
            
        }
        System.out.println("Sum of negative no. is "+nes);
        System.out.println("Sum of positive even no. is "+pes);
        System.out.println("Sum of positive odd no. is "+pos);
        System.out.printf("%d,%d,%d",nes,pes,pos);
        in.close();
    }
}