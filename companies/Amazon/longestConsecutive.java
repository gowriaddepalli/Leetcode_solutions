class Solution {
    
    public int longestConsecutive(int[] nums) {
        
        if(nums.length == 0)
        {
            return 0;
        }
        
        if(nums.length == 1)
        {
            return 1;
        }
        
        //First turn the input into a set of numbers. That takes O(n) and then we can ask in         O(1) whether we have a certain number.

        //Then go through the numbers. If the number x is the start of a streak (i.e., x-1 is         not in the set), then test y = x+1, x+2, x+3, ... and stop at the first number y not         in the set.
        
        HashSet<Integer> hs = new HashSet<Integer>();
        
        for(int i=0; i<nums.length; i++)
        {
           hs.add(nums[i]);
        }
        
        int max = 0;
        
        for(int i=0; i<nums.length; i++)
        {
          int best =0;
            if(!hs.contains(nums[i]-1)) {
              int y = nums[i]+1; 
              best++;
              while(hs.contains(y))
              {
                  y = y+1;
                  best++;
              }
          } 
            
            max = ((max<best) ? (max = best) : max);
        }
        return max;
    }
}
