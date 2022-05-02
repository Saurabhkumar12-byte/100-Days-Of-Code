/**
 * subsequence
 */
public class subSequence {

    public static void main(String[] args) {
        
        String word="abc";
        String sb= "";
        skip(word,0,word.length(),sb);
    }
    private static void skip(String word,  int i, int n,  String sb) {
        
        if(i==n){
            System.out.println(sb);
            return;
        }
        skip(word,i+1,n,sb);
        skip(word,i+1,n,sb+word.charAt(i));
        
        
    }
}