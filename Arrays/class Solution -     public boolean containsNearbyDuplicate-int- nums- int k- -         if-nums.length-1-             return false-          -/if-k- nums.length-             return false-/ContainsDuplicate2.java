class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums.length<=1){
            return false; 
        } 
        
        /*if(k> nums.length){
            return false;
        }*/
         
        HashMap<Integer,Integer> hm = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++)
        { 
            if(hm.containsKey(nums[i])){
                int j = hm.get(nums[i]);
                if((i-j)<=k){
                    return true;
                }else
                {
                    hm.put(nums[i], i);
                }
            }else{
                hm.put(nums[i],i);
            }
              
        } 
         
        return false; 
    }
}
