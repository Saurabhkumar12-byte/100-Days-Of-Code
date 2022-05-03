import java.util.ArrayList;

/**
 * permutation
 */
public class permutationRet {
    public static void main(String[] args) {
        String str= "";
        String word="abc";
        System.out.println(permutationFunc(str,word).toString());
    }
        public static ArrayList<String> permutationFunc(String p, String up) {
            if (p.length()==up.length()) {
                ArrayList<String> list= new ArrayList<>();
                list.add(p);
                return list;
            }
            ArrayList<String> ans= new ArrayList<>();
            for (int i = 0; i <=p.length(); i++) {
                String newP= p.substring(0, i)+ up.charAt(p.length())+ p.substring(i, p.length());
                ans.addAll(permutationFunc(newP, up));
            }
            return ans;
        }
    }