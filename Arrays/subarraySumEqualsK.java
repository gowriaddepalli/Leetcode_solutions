class Solution {
    public int subarraySum(int[] nums, int k) {
     
        
        int count =0;
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        int curr_sum =0;
        
        for(int i=0;i<nums.length; i++)
        {
          curr_sum += nums[i]; 
          
          if(curr_sum == k){
              count++;
          }
            
         if(hm.containsKey(curr_sum -k)){
             count += hm.get(curr_sum-k);
         }
            
         Integer res = hm.get(curr_sum);
            if(res == null){
                hm.put(curr_sum,1);
            }else{
                hm.put(curr_sum, res+1);
            }
              
            
        }
        
        return count;
    }
}
