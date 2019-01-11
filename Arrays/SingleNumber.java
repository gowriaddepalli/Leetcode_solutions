class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int sum =nums[0];
        for(int i=1;i<nums.length; i++)
        {
            if(nums[i]==nums[i-1])
            {
                sum = sum - nums[i];
            }else
            {
                sum = sum+nums[i];
            }
        }
        return sum;
    }
}
