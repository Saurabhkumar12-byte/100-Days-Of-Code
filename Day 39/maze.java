public class maze {
    public static void main(String[] args) {
        String str = "";
        mazePath(3, 3, str);
    }

    public static void mazePath(int r, int c, String s) {

        if (r == 1 && c == 1) {
            System.out.println(s);
            return;
        }
        if (r > 1) {
            mazePath(r - 1, c, s + 'D');
        }
        if (c > 1) {
            mazePath(r, c - 1, s + 'R');
        }

    }
}
