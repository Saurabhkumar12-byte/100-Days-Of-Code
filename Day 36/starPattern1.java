public class starPattern1 {
    public static void main(String[] args) {
        starPattern(0,3);
    }
    public static void starPattern(int i, int j) {
        if (i==4) {
            return;
        }
        if (j>=i) {
            System.out.print("*");
            starPattern(i, j-1);
        }
        else{
            System.out.print("\n");
            starPattern(i+1, 3);
        }
    }
}
