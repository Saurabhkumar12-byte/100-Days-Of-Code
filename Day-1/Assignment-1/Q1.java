// package Assignment1;
// Input a year and find whether it is a leap year or not.

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        System.out.println("Enter the year you want to check for leap year");
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        if (year % 4 == 0) {
            System.out.println("It's a leap year");
        } else {
            System.out.println("It's not a leap year");
        }
        in.close();

    }
}