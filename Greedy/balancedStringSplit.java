class Solution {
    public int balancedStringSplit(String s) {
     
        char[] p = s.toCharArray();
        int count =0;
        int balance =0;
        for(int i=0; i<p.length; i++){
           if(p[i] == 'L'){
               balance += 1;
           }else{
               balance -= 1;
           }
            
            if(balance == 0){
                count += 1;
            }
        }
        return count;
    }
}
