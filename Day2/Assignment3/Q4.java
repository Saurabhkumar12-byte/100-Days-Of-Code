package Assignment3;

import java.util.Scanner;
// 2. Area Of Triangle
public class Q4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the base of triangle");
        int base= in.nextInt();
        System.out.println("Enter the height of triangle");
        int height= in.nextInt();
        System.out.println("area of triangle is: "+(base*height)/2);
        in.close();
    }
}
