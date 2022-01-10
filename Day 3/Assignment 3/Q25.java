import java.util.Scanner;
// 25. Take integer inputs till the user enters 0 and print the largest number from all.

public class Q25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        int max=0;
        do {
            num=in.nextInt();
            if (num>max) {
                max=num;
            }
           
        } while (num!=0);
        System.out.println(max);
        in.close();
    }
}
