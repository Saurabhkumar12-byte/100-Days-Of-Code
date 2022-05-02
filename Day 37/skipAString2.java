public class skipAString2 {

    public static void main(String[] args) {
        String ch="apple";
        String word="heappllappleu";
        StringBuilder sb= new StringBuilder("");
        System.out.println(skip(word,ch,0,word.length(),sb,"app"));
        // System.out.println(word.substring(4, 4+ch.length()));
    }
    private static String skip(String word, String ch, int i, int n,  StringBuilder sb, String skip) {
        if(word.length()==0){
            return "not a string";
        }
        if(i==n){
            return sb.toString();
        }
        if(i<=(word.length()-ch.length()) && word.substring(i, i+skip.length()).equals(skip) && !word.substring(i, i+ch.length()).equals(ch)){
          
            return skip(word,ch,i+skip.length(),word.length(),sb,skip);
         }
        // if(i<=(word.length()-ch.length()) && word.substring(i, i+ch.length()).equals(ch)){
          
        //    return skip(word,ch,i+ch.length(),word.length(),sb,skip);
        // }
        else{
            sb.append(word.charAt(i));
            // boolean hi=i<(word.length()-ch.length()) && word.substring(i, i+ch.length()) == "apple";
            return skip(word,ch,i+1,word.length(),sb,skip);
        }
        
    }
}