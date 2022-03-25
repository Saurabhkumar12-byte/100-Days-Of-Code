// 13.      *
//         * *
//        *   *
//       *     *
//      *********
import java.util.Scanner;
public class Pattern13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (2*n)-1; j++) {
                if (i==n-1){
                    System.out.print("*");
                } else{
                    if(j==(((2*n)-1)/2)-i || j==(((2*n)-1)/2)+i ){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                    
                }
            }
            System.out.println();
        }
        in.close();
    }
}
