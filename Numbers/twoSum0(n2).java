class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int[] finalIndices =null;
        if(nums.length<2){
            return null;
        }
        
        for(int i=0; i<nums.length-1; i++)
        {
           int start = nums[i];
            for(int j=i+1; j<=nums.length-1;j++)
            {
                if(start+ nums[j]== target)
               {
                 finalIndices= new int[2];
                 finalIndices[0] = i;
                 finalIndices[1] = j;
               }
            }
        }
        
        return finalIndices;
    }
}
