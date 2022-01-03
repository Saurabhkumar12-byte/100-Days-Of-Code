// 24. Take integer inputs till the user enters 0 and print the sum of all numbers
import java.util.Scanner;


public class Q24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum=0;
        int num;
        do {
            num=in.nextInt();
            sum+=num;
        } while (num!=0);
        System.out.println(sum);
        in.close();
    }
}
