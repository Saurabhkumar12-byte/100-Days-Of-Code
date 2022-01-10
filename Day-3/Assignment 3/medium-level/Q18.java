import java.util.Scanner;
// 18. Find if a number is palindrome or not 

public class Q18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num=in.nextInt();
        int temp=num;
        int sum=0;
        while (num>0) {
            int rem= num%10;
            sum=sum*10+rem;
            num=num/10;
        }
        if (temp==sum) {
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
        in.close();
    }
}
