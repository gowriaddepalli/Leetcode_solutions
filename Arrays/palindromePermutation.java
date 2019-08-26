class Solution {
    public boolean canPermutePalindrome(String s) {
        int n = s.length();
        char c[] = new char[128];
        char[] st= s.toCharArray();
        for(int i=0; i<st.length; i++){
           c[st[i]]++;
        }
        int no2 = 0;
        int no1 = 0;
        
        for(int i =0; i<128; i++){
           if(c[i]%2 != 0){
               no1 +=c[i]%2;
           } 
        }
        
        if(n%2 == 0 && no1>0){
            return false;
        }
        
        if(n%2 !=0 && no1>1){
            return false;
        }
        
        return true;
    }
}
