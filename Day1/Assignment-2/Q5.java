import java.util.Scanner;
// 5. Take 2 numbers as input and print the largest number.
public class Q5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        if (num1>num2) {
            System.out.println(num1);
            
        }
        else{
            System.out.println(num2);
        }
        in.close();
    }
}
