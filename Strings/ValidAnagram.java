class Solution {
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
