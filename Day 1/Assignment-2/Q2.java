import java.util.Scanner;
// 2. Take name as input and print a greeting message for that name.


public class Q2 {
    public static void main(String[] args) {
        System.out.println("enter your name");
        Scanner in = new Scanner(System.in);
        String name = in.next();
        System.out.println("Good Morning: "+name);
        in.close();
        
    }
}
