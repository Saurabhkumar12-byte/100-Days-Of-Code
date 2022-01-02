import java.util.Scanner;

// 4. Take in two numbers and an operator (+, -, *, /) and calculate the value.
public class Q4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 6;
        int b = 2;
        System.out.println("enter operator");
        char operator = in.next().charAt(0);
        if (operator == '+') {
            System.out.println(a + b);
        }
        if (operator == '-') {
            System.out.println(a - b);
        }
        if (operator == '*') {
            System.out.println(a * b);
        }
        if (operator == '/') {
            System.out.println(a / b);
        }

        in.close();
    }
}
