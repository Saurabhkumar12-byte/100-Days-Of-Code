/**
 * permutation
 */
public class permutation {
public static void main(String[] args) {
    String str= "";
    String word="abc";
    permutationFunc(str,word);
}
    public static void permutationFunc(String p, String up) {
        if (p.length()==up.length()) {
            System.out.println(p);
            return;
        }
        for (int i = 0; i <=p.length(); i++) {
            String newP= p.substring(0, i)+ up.charAt(p.length())+ p.substring(i, p.length());
            permutationFunc(newP, up);
        }
    }
}