class Solution {
    public int lengthOfLastWord(String s) {
        int len = 0;
        
        String p[] = s.split("\\s+");
        int n = p.length;
        if(n>0){
         len = p[n-1].length();   
        }
        
        return len;
    }
}
