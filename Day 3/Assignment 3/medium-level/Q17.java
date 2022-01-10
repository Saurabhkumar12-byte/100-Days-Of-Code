import java.util.Scanner;
// 17. Reverse A String In Java

public class Q17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter String : ");
        String s = input.next();
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        System.out.println("Reverse of String : " + rev);

        input.close();
    }
}