//     *
//     **
//     ***
//     ****
//     *****
//     ****
//     ***
//     **
//     *
import java.util.Scanner;
public class Pattern5 {
    
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-1-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        in.close();
    }
}
