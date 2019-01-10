class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        
     // The trick here is to keep adding the sum and have the modulus of the sum, if the modulus repeats , that means the thier is a subset that sums up to k. Like for example if 23%6= 5, then adding 2 and 4, we get 29%5 = 5, this means this subset contains k or multiple of k.
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        hm.put(0,-1);
        int totalSum =0;
      
        for(int i=0; i<nums.length; i++)
        {
            totalSum += nums[i];
            if(k !=0)
            {
                totalSum = totalSum%k;
            }
            if(hm.containsKey(totalSum)){
               Integer prev = hm.get(totalSum);
               if (prev != null) {
               if (i - prev > 1)
               return true;
                }
            }else
            {
                hm.put(totalSum, i);
            }
            
        }
        
        return false;
    }
}
