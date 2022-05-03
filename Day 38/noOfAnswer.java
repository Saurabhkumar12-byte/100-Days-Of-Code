

/**
 * permutation
 */
public class noOfAnswer {
    public static void main(String[] args) {
        String str= "";
        String word="abc";
        System.out.println(permutationFunc(str,word));
    }
        public static int permutationFunc(String p, String up) {
            if (p.length()==up.length()) {
               
                return 1;
            }
            int ans= 0;
            for (int i = 0; i <=p.length(); i++) {
                String newP= p.substring(0, i)+ up.charAt(p.length())+ p.substring(i, p.length());
                ans= ans+ permutationFunc(newP, up);
            }
            return ans;
        }
    }