import java.util.Scanner;
// 6. Input currency in rupee and output in dollar.
public class Q6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int rupee= in.nextInt();
        System.out.println(rupee/75);
        in.close();
    }
}
