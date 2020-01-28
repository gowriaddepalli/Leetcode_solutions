class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
       
        if(s.length() <k ){
           return s.length();
       } 
        
        int left=0; int right=0; 
        
        HashMap<Character,Integer> hm = new HashMap<>();
        
        int max_len =k;
        int n = s.length();
        
        while(right<n){
           if(hm.size()<k+1){
               hm.put(s.charAt(right), right++);
           } 
            
            if(hm.size()==k+1){
             int del_idx =  Collections.min(hm.values());
             hm.remove(s.charAt(del_idx));
                
             left = del_idx+1;
            }
            
            
            
            
            max_len = Math.max(max_len, right - left);
        }
      
        return max_len;
    }
}
