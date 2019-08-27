class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> as = new ArrayList<>();
        for(String w: words)
        {
            if(w.length() == pattern.length()){
                HashMap<Character,Character> hm = new HashMap<>();
                for(int i=0; i<pattern.length(); i++){
                    if((!hm.containsKey(pattern.charAt(i))) && (!hm.containsValue(w.charAt(i)))){
                        hm.put(pattern.charAt(i), w.charAt(i));
                    }else if(!hm.containsKey(pattern.charAt(i)) && hm.containsValue(w.charAt(i)))
                    {
                        hm.clear();
                        break;
                    }
                    else if(hm.containsKey(pattern.charAt(i)) && (hm.get(pattern.charAt(i)) != w.charAt(i))){
                        hm.clear();
                        break;
                        
                    }
                    if(i == pattern.length()-1){
                        as.add(w);
                        hm.clear();
                    }
                }
        }      
            
        }
        return as;
    }
}
