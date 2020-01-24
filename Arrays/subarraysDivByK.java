class Solution {
    public int subarraysDivByK(int[] A, int K) {
        int count =0;
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        // here the thing is to keep a hashmap with keys  as remainders from 0 to k-1;
        
        int curr_sum =0;
        
        for(int i=0;i<A.length; i++)
        {
          curr_sum += A[i]; 
          
          if(curr_sum%K ==0){
              count++;
          }
            // you get rem either -i or +i, they mean the same.
            int s = (curr_sum%K + K)%K;
            
         if(hm.containsKey(s)){
             count += hm.get(s);
         }
            
         Integer res = hm.get(s);
            if(res == null){
                hm.put(s,1);
            }else{
                hm.put(s, res+1);
            }
              
            
        }
        
        return count;
    }
}
