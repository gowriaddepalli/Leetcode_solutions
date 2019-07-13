class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0){
            return "";
        }
        int minLength = Integer.MAX_VALUE;
        for(String s: strs){
            minLength = Math.min(minLength, s.length());
        }
        
        int low = 0;
        int high = minLength;
        
        while(low <= high){
            int mid = high +(low-high)/2;
            if(isCommonPrefix(strs, mid)){
                low = mid + 1;
            }else{
                high  = mid -1;
            }
        }
        
        return strs[0].substring(0, (low+high)/2);
    }
    
    public boolean isCommonPrefix(String[] strs, int length){
        String str1 = strs[0].substring(0,length);
        for(int i=1; i<strs.length; i++){
            if(!strs[i].startsWith(str1)){
                return false;
            }
        }
      return true;
    }
}
