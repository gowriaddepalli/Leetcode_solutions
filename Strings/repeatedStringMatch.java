class Solution {
    public int repeatedStringMatch(String A, String B) {
        int count =1;
        String p = A;
        while(p.length()<= 10000){
            if(p.indexOf(B)>-1){
                break;
            }
            p += A;
            count++;
            
        }
        
        if(p.indexOf(B) == -1){
            return -1;
        }
        return count;
    }
}
