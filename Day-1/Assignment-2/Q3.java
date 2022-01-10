import java.util.Scanner;
// Write a program to input principle, time and rate (P, T, R) from user and find Simple Interest.
public class Q3 {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("enter the principle");
    int p = in.nextInt();
    System.out.println("enter the time");
    int t =in.nextInt();
    System.out.println("enter the rate");
    int r = in.nextInt();
    int SI= (p*r*t)/100;
    System.out.println("the simple interest is: "+SI);
    in.close();
}
    
}