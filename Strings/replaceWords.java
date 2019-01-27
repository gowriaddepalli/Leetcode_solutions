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
