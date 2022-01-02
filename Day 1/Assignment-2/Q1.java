// package Assignment-2;
// 1. Write a program to print whether a number is even or odd, also take input.
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a number");
        int num=in.nextInt();
        if (num%2==0) {
            System.out.println(num+" is a even number");
        } else {
            System.out.println(num+" is a odd number");
        }
        in.close();
    }
}
