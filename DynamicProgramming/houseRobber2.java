class Solution {
    public int rob(int[] nums) {
         //if nums is null or length 0, return 0
    if(nums==null || nums.length==0)
        return 0;
        
    //if only 1 element is present,return it as the answer
    if(nums.length==1)
        return nums[0];
        
    if(nums.length ==2){
        if(nums[0]>nums[1]){
            return nums[0];
        }
        return nums[1];
    }
        
    //array to store the maxProfit attained
    int[] maxProfit=new int[nums.length-1];
    
    int[] maxProfit2=new int[nums.length-1];
    
    //assign fisrt value
    maxProfit[0]=nums[0];
        
    maxProfit2[0]=nums[1];
    
    //second value is higher of first and second
    maxProfit[1]=Math.max(nums[0],nums[1]);
        
    maxProfit2[1]=Math.max(nums[1],nums[2]);
    
    //do dynamic programming for subsequent values
    for(int i=2;i<nums.length-1;i++)
    {
        maxProfit[i]=Math.max(maxProfit[i-2]+nums[i],maxProfit[i-1]);
    }
        
    //do dynamic programming for subsequent values
    for(int i=3;i<nums.length;i++)
    {
        maxProfit2[i-1]=Math.max(maxProfit2[i-3]+nums[i],maxProfit2[i-2]);
    }
    
    //return the last value as answer
    return maxProfit[nums.length-2]>maxProfit2[nums.length-2] ? maxProfit[nums.length-2] : maxProfit2[nums.length-2];
    }
}
