class Solution {
    public int[] findErrorNums(int[] nums) {
        
        Arrays.sort(nums);
        
        int res[] = new int[2];
        int sum1 = 0;
        int n = nums.length;
        
        int sum = (n* (n+1))/2;
        //System.out.println(sum);
        
        for(int i=0; i<nums.length-1; i++){
            sum1 += nums[i];
            if(nums[i] == nums[i+1]){
                res[0] = nums[i];
            }
        }
        
        sum1 += nums[n-1];
        
        res[1]= sum-(sum1- res[0]);
        
        return res;
    }
}
