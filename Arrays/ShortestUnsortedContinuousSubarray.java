// Compare the elements to the global maxima/minima.  

class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int n = nums.length;
        int max = nums[0];
        int min = nums[n-1];
        int end =-2;
        int start =-1;
        
        for(int i=0; i<n;i++)
        {
            min = Math.min(nums[n-1-i],min);
            max = Math.max( nums[i], max);
            if(nums[i]< max)
            {
                end =i;
            }
            if(nums[n-1-i]> min)
            {
                start = n-1-i;
            }
        }
        //System.out.println(start);
        //System.out.println(end);
        return end -start +1;
    }
}
