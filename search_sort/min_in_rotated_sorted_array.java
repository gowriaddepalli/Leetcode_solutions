class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int pivot =-1;
        for(int i =1; i<n; i++)
        {
            if(nums[i]<nums[i-1])
            {
                pivot =i;
                break;
            }
        }
        
        if(pivot == -1)
        {
            pivot=0;
        }
        
        return nums[pivot];
    }
}
