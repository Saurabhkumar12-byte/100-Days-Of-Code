import java.util.ArrayList;

/**
 * subsequence
 */
public class subSequenceReturn {

    public static void main(String[] args) {
        
        String word="abc";
        String sb= "";
        System.out.println(skip(word,0,word.length(),sb));
    }
    private static ArrayList<String> skip(String word,  int i, int n,  String sb) {
        
        if(i==n){
            ArrayList<String> list= new ArrayList<>();
            list.add(sb);
            return list;
        }
        ArrayList<String> left= skip(word,i+1,n,sb);
        ArrayList<String> right= skip(word,i+1,n,sb+word.charAt(i));
        left.addAll(right);
        return left;
        
    }
}