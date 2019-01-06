class Solution {
    public int firstUniqChar(String s) {
        
        if(s.length()==0){
            return -1;
        }
        
        if(s.length()==1){
            return 0;
        }
        
        LinkedHashMap<Character, Integer> lhm = new LinkedHashMap<Character,Integer>();
        
        for(int i=0; i<s.length(); i++){
            if(!lhm.containsKey(s.charAt(i)))
            {
                lhm.put(s.charAt(i), 1);
            }else{
                lhm.put(s.charAt(i), (lhm.get(s.charAt(i))+1));
            }
        }
        
        for(int i=0; i<s.length(); i++){
            if(lhm.get(s.charAt(i))==1){
                return i;
            }
        }
        
        return -1;
    }
}
