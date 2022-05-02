/**
 * skipACharacter
 */
public class skipACharacter {

    public static void main(String[] args) {
        char ch='a';
        String word="Raju";
        StringBuilder sb= new StringBuilder("");
        System.out.println(skip(word,ch,0,word.length(),sb));
    }
    private static String skip(String word, char ch, int i, int n,  StringBuilder sb) {
        if(word.length()==0){
            return "not a string";
        }
        if(i==n){
            return sb.toString();
        }
        if(word.charAt(i)!='a'){
           sb.append(word.charAt(i));
        }
        return skip(word,ch,i+1,word.length(),sb);
    }
}