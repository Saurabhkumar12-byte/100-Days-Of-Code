package Assignment3;

import java.util.Scanner;
// 2. Area Of parallogram
public class Q5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the base of parallogram");
        int base= in.nextInt();
        System.out.println("Enter the height of parallogram");
        int height= in.nextInt();
        System.out.println("area of parallogram is: "+base*height);
        in.close();
    }
}
