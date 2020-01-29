class Solution {
    
    // Similar to house robber one.
    // reference: https://leetcode.com/problems/delete-and-earn/discuss/109891/Sharing-my-Simple-Straight-Forward-Java-O(n)-Solution-Explanation-Included
    
    public int deleteAndEarn(int[] nums) {
        int sum[] =  new int[10002];
        for(int i=0; i< nums.length; i++){
            sum[nums[i]] += nums[i];
        }
        
        for(int j=2; j<sum.length; j++){
            sum[j] = Math.max(sum[j]+sum[j-2], sum[j-1]);
        }
        
        return sum[sum.length-1];
    }
}
