import java.util.Scanner;
// 15. Armstrong Number In Java

public class Q15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num=in.nextInt();
        int temp=num;
        int sum=0;
        while (num>0) {
            int rem= num%10;
            sum+=rem*rem*rem;
            num=num/10;
        }
        if (temp==sum) {
            System.out.println("armstrong");
        }
        else{
            System.out.println("not armstrong");
        }

        in.close();
    }
}
