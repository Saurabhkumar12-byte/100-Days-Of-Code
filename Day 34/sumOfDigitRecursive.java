public class sumOfDigitRecursive {
    public static void main(String[] args) {
        System.out.println(sum(4321));
    }
    public static int sum(int num) {
        
        if (num==0) {
            return num;
        }
        int rem=num%10;
        num=num/10;
        return rem+sum(num);
    }
}
