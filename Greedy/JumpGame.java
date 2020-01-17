class Solution {
    public boolean canJump(int[] nums) {
        int lastgoodIndex = nums.length-1;
        for(int i= nums.length-1; i>=0; i--){
            if(i+nums[i] >= lastgoodIndex){
                lastgoodIndex = i;
            }
        }
        return lastgoodIndex ==0;
    }
}
