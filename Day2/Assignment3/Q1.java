package Assignment3;
import java.lang.Math;
import java.util.Scanner;

/**
 * Q1. Area Of Circle Java Program
 */
public class Q1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the radius");
        int radius= in.nextInt();
        double area = Math.PI *radius*radius;
        System.out.println("Area of circle is: "+area);
        in.close();
    }
}


