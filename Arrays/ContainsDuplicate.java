class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        if(nums.length<=1){
            return false;
        }
        
        HashMap<Integer,Integer> hm = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++)
        {
            if(!hm.containsKey(nums[i])){
                hm.put(nums[i],1);
            }else{
                return true;
            }
        }
        
        return false;
    }
}
