import java.util.*;
class Solution {
    public String replaceWords(List<String> dict, String sentence) {
        
        //dict = new ArrayList<String>();
        
        Collections.sort(dict);
        String[] r = sentence.split("\\s+");
        String finalSent = "";
        
        for(String s: dict){
            for(int i=0; i<r.length; i++){
                String p = r[i];
                if(p.startsWith(s)){
                    r[i]= s;
                }
            }
        }
        
        for(int i=0; i<r.length; i++){
         finalSent += r[i] + " ";   
        }
        
        return finalSent.trim();
    }
}


##### Better Solution #################
class Solution {
    public String replaceWords(List<String> roots, String sentence) {
        Set<String> rootset = new HashSet();
        for (String root: roots) rootset.add(root);

        StringBuilder ans = new StringBuilder();
        for (String word: sentence.split("\\s+")) {
            String prefix = "";
            for (int i = 1; i <= word.length(); ++i) {
                prefix = word.substring(0, i);
                if (rootset.contains(prefix)) break;
            }
            if (ans.length() > 0) ans.append(" ");
            ans.append(prefix);
        }
        return ans.toString();
    }
}
