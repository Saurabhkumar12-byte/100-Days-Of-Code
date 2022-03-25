//          *
//         * *
//        * * *
//       * * * *
//      * * * * *

import java.util.Scanner;
    public class Pattern10 {
        public static void main(String[] args) {
            Scanner in =new Scanner(System.in);
            int n=in.nextInt();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < (2*n)-1; j++) {
                    if(j>=(((2*n)-1)/2)-i && j<=(((2*n)-1)/2)+i && (j+i)%2==0 ){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            in.close();
            
        }
    }
