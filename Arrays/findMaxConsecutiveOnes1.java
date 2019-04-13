class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        if(nums.length<1) return 0;
        
        int max=0;
        int count=nums[0]==1?1:0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=1){
                max=Math.max(max,count);
                count=0;
            }else{
                count++;
            }
        }
        return Math.max(max,count);
    }
}
