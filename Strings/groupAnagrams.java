class Solution {
    
    List<List<String>> al = new ArrayList<List<String>>();
    public List<List<String>> groupAnagrams(String[] strs) {
        
        ArrayList<String> org = new ArrayList<String>(Arrays.asList(strs));
            
        for(int i=0;i<strs.length;i++){
            
            if(org.contains(strs[i]))
            {
            List<String> addstrng = new ArrayList<String>();
            addstrng.add(strs[i]);
            org.remove(strs[i]);
                for(int j= i+1; j<strs.length; j++){
               
                if((org.contains(strs[j])) && isAnagram(strs[i],strs[j]))
                    
                {
                    org.remove(strs[j]);
                    addstrng.add(strs[j]);
                }
            }
                al.add(addstrng);  
            }
        }
        return al;
    }
    
    public boolean isAnagram(String s, String t) {
       char[] allLetter = new char[128];
          
        for(int i = 0; i<s.length(); i++){
            allLetter[s.charAt(i)]++;
        }  
          
        for(int i = 0; i<t.length(); i++){
            allLetter[t.charAt(i)]--;
        }  
          
        for(int i = 0; i<allLetter.length; i++){
            if(allLetter[i]!=0){
                return false;  
            }  
        }  
          
        return true;   
    } 
}
