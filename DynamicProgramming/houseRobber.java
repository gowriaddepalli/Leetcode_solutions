class Solution {
    int[] memo;
    public int rob(int[] nums) {
        
        memo = new int[nums.length+1];
        Arrays.fill(memo,-1);
        return robDP(nums.length-1, nums);
    }
    
    public int robDP(int i, int[] nums)
    {
        if(i<0){
            return 0;
        }
        
        if(memo[i]>=0){
            return memo[i];
        }
        
        memo[i] = Math.max(nums[i] + robDP(i-2, nums), robDP(i-1, nums));
        return memo[i];
    }
}
