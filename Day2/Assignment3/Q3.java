package Assignment3;
import java.util.Scanner;
// 3. Area Of Rectangle Program 
public class Q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the side");
        int side= in.nextInt();
        int area = side*side;
        System.out.println("Area of circle is: "+area);
        in.close();
    }
}
