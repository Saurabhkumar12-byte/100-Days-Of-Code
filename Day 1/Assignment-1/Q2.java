package Assignment1;//package Assignment1;

import java.util.Scanner;

//Take two numbers and print the sum of both.
public class Q2 {

    public static void main(String[] args) {
        System.out.println("Enter first number:");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println("Enter Second number:");
        int b = in.nextInt();
        System.out.println("sum of two no. is: " + (a + b));
//        in.close();

    }
}