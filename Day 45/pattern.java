public class pattern {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                if (j >= (5 - i) && j <= (5 + i)) {
                    if ((j - i) % 2 == 1 || (i - j) % 2 == 1) {
                        System.out.print(i + 1);
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
