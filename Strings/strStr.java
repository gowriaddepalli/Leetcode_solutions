class Solution {
    public int strStr(String haystack, String needle) {
        
        int nLength = needle.length();
        
        if(needle.equals("")){
            return 0;
        }
        
        for(int i = 0 ;i< haystack.length()-nLength+1; i++){
            //System.out.println(haystack.substring(i, i+nLength));
            if(haystack.substring(i, i+nLength).equals(needle)){
                return i;
            }
        }
        
        return -1;
    }
}
