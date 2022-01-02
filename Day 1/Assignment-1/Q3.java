package Assignment1;

import java.util.Scanner;
// Take a number as input and print the multiplication table for it.
public class Q3 {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int i =1;
        while (i<11) {
            System.out.println(number +"x"+ i +"="+(number*i));
            i++;
        }
//        in.close();
    }
}
