class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int s = nums.length;
        int n = nums[0]*nums[1]*nums[s-1];
        int m = nums[s-1]*nums[s-2]*nums[s-3];
        
        return n>m ? n :m;
    }
}
